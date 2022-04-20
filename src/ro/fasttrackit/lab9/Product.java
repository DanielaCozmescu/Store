package ro.fasttrackit.lab9;

public class Product {
    double price;
    String name;
    String description;
    int quantity;

    public Product(double price, String name, String description, int quantity) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public void discount(int d) {
            this.price = this.price - (this.price * d /100);
    }

    public void quantitySold(int quantity) {
        this.quantity -= quantity;
    }
}
