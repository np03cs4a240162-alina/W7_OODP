
package week7;

public class ShoppingMain {
public static void main(String[] args) {
    Product p1 = new Product("P001", "Laptop", 1200.0, 10);
    Product p2 = new Product("P002", "Smartphone", 800.0, 5);
    Product p3 = new Product("P003", "Headphones", 150.0, 20);

    Product[] products = {p1, p2, p3};

    Customer customer = new Customer("C001", "Alice", "alice@example.com", "1234");
    customer.register();
    customer.login("1234");

    customer.viewProducts(products);

    customer.addToCart(p1, 1);
    customer.addToCart(p3, 2);

    customer.checkout();
}
}
