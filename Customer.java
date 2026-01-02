
package week7;
public class Customer {
	private String customerID;
	private String name;
	private String email;
	private String password;
	private ShoppingCart cart;
	
	/**
	 * Constructs Customer Constructor
	 * @param customerID
	 * @param name
	 * @param email
	 * @param password
	 * @param cart
	 */
	public Customer(String customerID, String name, String email, String password) {
		this.customerID = customerID;
		this.name = name;
		this.email = email;
		this.password = password;
		this.cart = new ShoppingCart();
	}
	
	/**
	 * Registers the customer
	 */
	public void register() {
		System.out.println(name + "Registered with " + email);
	}
	
	/**
	 * Logins the customer
	 * @param inputPassword
	 * @return
	 */
	public boolean login(String inputPassword) {
		if (password.equals(inputPassword)) {
			System.out.println(name + "Logged in successfully");
			return true;
		} else {
			System.out.println("Incorrect Password");
			return false;
		}
	}
	
	/**
	 * Customer views the products in the cart
	 * @param products
	 */
	public void viewProducts(Product[] products) {
		System.out.println("Available Products: ");
		for(Product p: products) {
			System.out.println(p.getDetails());
		}
	}
	
	/**
	 * Add a product to customer's cart
	 * @param product
	 * @param quantity
	 */
	public void addToCart(Product product, int quantity) {
		cart.addProduct(product, quantity);
	}
	
	public void checkout() {
		 System.out.println("\n--- Checkout ---");
	     cart.viewCartItems();
	     System.out.println("Thank you for your purchase, " + name + "!");
	}
	
	public ShoppingCart getCart() { 
		return cart; 
	}
	
	public String getCustomerID() {
		return customerID;
	}
	
}
