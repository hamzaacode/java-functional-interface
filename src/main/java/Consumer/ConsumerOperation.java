package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

 class ConsumerExample {
    public static void main(String[] args) {
        // Create a list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1000.0));
        products.add(new Product("Smartphone", 500.0));
        products.add(new Product("Headphones", 50.0));

        // Define a Consumer to apply a discount to each product
        Consumer<Product> applyDiscount = product -> {
            double discountedPrice = product.getPrice() * 0.9; // 10% discount
            System.out.println("Discounted " + product.getName() + ": $" + discountedPrice);
        };

        // Apply the discount to each product in the list using forEach
        products.forEach(applyDiscount);
    }
}
