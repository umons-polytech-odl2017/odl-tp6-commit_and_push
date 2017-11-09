public class Ingredient implements MyInterface{
    private double price;
    private String name;

    public Ingredient(String name) {
        this.name = name;
        if (name=="pâte")
            this.price=3;
        else if (name=="sauce tomate" || name == "crème blanche")
            this.price=1.5;
        else if (name=="fruit de mer ")
            this.price=2.5;
        else if (name=="fromage" || name == "jambon")
            this.price=2;
        else if (name=="olive" || name == "champignon")
            this.price=1;
        else
            throw new NullPointerException();
    }

    @Override
    public double GetPrice() {
        return price;
    }
}
