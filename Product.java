
package week7;

/**
 * Represents the product section in online shopping system
 */
public class Product {
	private String productID;
	private String name;
	private double price;
	private int stockQuantity;
	
	/**
	 * Constructs Product Constructor
	 * @param productID
	 * @param name
	 * @param price
	 * @param stockQuantity
	 */
	public Product(String productID, String name, double price, int stockQuantity) {
		this.productID = productID;
		this.name = name;
		this.price = price;
		this.stockQuantity = stockQuantity;
	}
	
	/**
	 * Returns product details in a formatted String
	 * @return
	 */
	public String getDetails() {
		return "Product ID: " + productID + "Name: " + name + "price: " + price + "Stock Quantity: " + stockQuantity;  
	}
	
	/**
	 * Checks whether the product is available or not
	 * @return
	 */
	public boolean checkAvailability() {
		if (stockQuantity > 0) {
			System.out.println("Product Available");
			return true;
		} else {
			return false;
		}
	}
	
	public String getProductID(){
		return productID;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getStockQuantity() {
		return stockQuantity;
	}
	
	public String getName() {
		return name;
	}
	
}
