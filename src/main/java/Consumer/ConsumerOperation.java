package Consumer;

import java.util.ArrayList;
import java.util.List;

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

    public void setName(String price) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
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
//        Consumer<Product> applyDiscount = product -> {
//            double v = product.getPrice() * 0.9;
//            System.out.println(v);
//        };
//
//        // products.forEach(product -> {double discountedPrice =product.getPrice() * 0.9)};
//
//        // Apply the discount to each product in the list using forEach
//        products.forEach(applyDiscount);

        products.forEach(product -> product.setPrice(product.getPrice() * 0.9));

        products.forEach(product -> System.out.println(product.getPrice()));

    }
}
