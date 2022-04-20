package ro.fasttrackit.lab9;

public class Cosmetics extends Product{
    String color;
    int weight;

    public Cosmetics(double price, String name, String description, int quantity, String color, int weight) {
        super(price, name, description, quantity);
        this.color = color;
        this.weight = weight;
    }

    @Override
    public void discount(int d) {
        if (d < 20){
            this.price = this.price - (this.price * d /100);
        }
    }

    public void changeColor(String color) {
        this.color = color;
    }
}
