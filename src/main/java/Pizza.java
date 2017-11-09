import java.util.*;

public class Pizza implements MyInterface{
    String name;
    double price;
    private Set<Ingredient> ingredients = new HashSet<>();

    public Pizza(String name,double price) {
        this.name = name;
        this.price=price;
        /*if (name=="Margherita") {
            ingredients.add(new Ingredient("pâte"));
            ingredients.add(new Ingredient("sauce tomate"));
            ingredients.add(new Ingredient("fromage"));
        }*/
    }

    @Override
    public double GetPrice() {
        return 0;
    }
}
