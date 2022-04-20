package ro.fasttrackit.lab9;

public class StoreMain {
    public static void main(String[] args) {
        Product p = new Product(30.99,"Lip balm","for dry lips",10);
        p.discount(10);
        System.out.println("Price after discount is " + p.price);
        p.quantitySold(3);
        System.out.println("Remaining quntity of " + p.name + " is " + p.quantity);
        Cosmetics c = new Cosmetics(50.25,"Eyeliner","long lasting",25,"black",20);
        c.discount(2);
        System.out.println("Price after discount is " + c.price);
        c.changeColor("brown");
        System.out.println("The color for " + c.name +" is now " + c.color);
        p = new Electronics(2300,"Freezer","keeps food frozen",5,20,25,175,100);
        System.out.println(p.toString());
        Fridge f = new Fridge(1300,"Arctic"," ",12,55,55,100,98,-2.5);
        f.temperatureDrop();
        System.out.println("New fridge temperature " + f.temperature);

    }
}
