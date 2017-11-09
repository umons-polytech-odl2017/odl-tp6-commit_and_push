public class Pizza implements Composant{

    private String name;
    private double price;

    public Pizza(String name) {
        this.name = name;
        this.price = price;
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
