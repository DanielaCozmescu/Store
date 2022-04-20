package ro.fasttrackit.lab9;

public class Fridge extends Electronics{
    double temperature;

    public Fridge(double price, String name, String description, int quantity, int length, int width, int height, int weight, double temperature) {
        super(price, name, description, quantity, length, width, height, weight);
        this.temperature = temperature;
    }

    public void temperatureDrop(){
        this.temperature = --this.temperature;
    }
}
