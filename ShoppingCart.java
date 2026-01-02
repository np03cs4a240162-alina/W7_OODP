
package week7;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a shopping cart containing products
 */
public class ShoppingCart {
	private Map<Product, Integer> cartItems;
	private double totalPrice;
	
	public ShoppingCart() {
		cartItems = new HashMap<>();
		totalPrice = 0;
	}
	
	/**
	 * Adds a product to the cart
	 * @param product
	 * @param quantity
	 */
	public void addProduct(Product product, int quantity) {
		if (!product.checkAvailability()) {
			System.out.println("Product Unavailable");
			return;
		} 
		cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
		calculateTotalPrice();
	}
	
	/**
	 * Removes a product from the cart
	 */
	public void removeProduct(Product product) {
		cartItems.remove(product);
		calculateTotalPrice();
	}
	
	/**
	 * Calculates the total price of all the products in cart
	 */
	public void calculateTotalPrice() {
		totalPrice = 0.0;
		for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
			 totalPrice += entry.getKey().getPrice() * entry.getValue();
		}
	}
	
	/**
	 * Displays all items in the cart with quantities
	 */
	public void viewCartItems() {
		 System.out.println("Shopping Cart:");
		 for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
			 System.out.println(entry.getKey().getName() + " - Quantity: " + entry.getValue() + " - Price: $" + entry.getKey().getPrice());
	    }
	        System.out.println("Total Price: $" + totalPrice);
	}
	
}
