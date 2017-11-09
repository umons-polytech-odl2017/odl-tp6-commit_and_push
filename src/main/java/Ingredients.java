public class Ingredients implements Composant {

    private double price;
    private String name;

    public Ingredients(String name, double price) {
        this.name = name;
        this.price = price;
       /* if (name == "sauce tomate") this.price = 1.50;
        if (name == "pâte") this.price = 3;
        if (name == "crème blanche") this.price = 1.50;
        if (name == "fromage") this.price = 2;
        if (name == "champignon") this.price = 1;
        if (name == "fruits de mer") this.price = 2.50;
        if (name == "jambon") this.price = 2;
        if (name == "olives") this.price = 1; */
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
