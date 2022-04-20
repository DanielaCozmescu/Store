package ro.fasttrackit.lab9;

public class Electronics extends Product{
    private int length, width, height, weight;

    public Electronics(double price, String name, String description, int quantity, int length, int width, int height, int weight) {
        super(price, name, description, quantity);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " with dimensions: " + length + "x" + width + "x" + height + " that weigh " + weight + "kg";
    }
}
