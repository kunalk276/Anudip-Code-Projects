package lab5;

import java.util.ArrayList;
import java.util.List;

interface Product {
    void showProduct();
    void addProduct(String productName, double price);
    void deleteProduct(String productName);
    double calculateProductPrice();
}

class OnlineProduct implements Product {
    private List<String> products;
    private List<Double> prices;

    public OnlineProduct() {
        products = new ArrayList<>();
        prices = new ArrayList<>();
    }

    @Override
    public void showProduct() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println("Product: " + products.get(i) + ", Price: rs" + prices.get(i));
        }
    }

    @Override
    public void addProduct(String productName, double price) {
        products.add(productName);
        prices.add(price);
    }

    @Override
    public void deleteProduct(String productName) {
        int index = products.indexOf(productName);
        if (index != -1) {
            products.remove(index);
            prices.remove(index);
        } else {
            System.out.println("Product not found!");
        }
    }

    @Override
    public double calculateProductPrice() {
        double total = 0;
        for (Double price : prices) {
            total += price;
        }
        return total;
    }
}

class PhysicalProduct implements Product {
    private List<String> products;
    private List<Double> prices;

    public PhysicalProduct() {
        products = new ArrayList<>();
        prices = new ArrayList<>();
    }

    @Override
    public void showProduct() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println("Product: " + products.get(i) + ", Price: rs " + prices.get(i));
        }
    }

    @Override
    public void addProduct(String productName, double price) {
        products.add(productName);
        prices.add(price);
    }

    @Override
    public void deleteProduct(String productName) {
        int index = products.indexOf(productName);
        if (index != -1) {
            products.remove(index);
            prices.remove(index);
        } else {
            System.out.println("Product not found!");
        }
    }

    @Override
    public double calculateProductPrice() {
        double total = 0;
        for (Double price : prices) {
            total += price;
        }
        return total;
    }
}

class Order {
    private Product product;

    public Order(Product product) {
        this.product = product;
    }

    public void showProducts() {
        product.showProduct();
    }

    public double calculateTotal() {
        return product.calculateProductPrice();
    }
}

public class Main5 {
    public static void main(String[] args) {
        // Online Products
        Product onlineProduct = new OnlineProduct();
        onlineProduct.addProduct("Laptop", 99999.99);
        onlineProduct.addProduct("Phone", 59099.99);
        onlineProduct.showProduct();
        System.out.println("Total price for online products: rs " + onlineProduct.calculateProductPrice());

        // Physical Products
        Product physicalProduct = new PhysicalProduct();
        physicalProduct.addProduct("Book", 200.99);
        physicalProduct.addProduct("Clothing", 4999.99);
        physicalProduct.showProduct();
        System.out.println("Total price for physical products: rs " + physicalProduct.calculateProductPrice());

        // Orders
        Order onlineOrder = new Order(onlineProduct);
        System.out.println("Total price for online order: rs " + onlineOrder.calculateTotal());

        Order physicalOrder = new Order(physicalProduct);
        System.out.println("Total price for physical order: rs " + physicalOrder.calculateTotal());
    }
}
