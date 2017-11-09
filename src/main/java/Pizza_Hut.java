public class Pizza_Hut implements Pizzeria{

    private static Pizza_Hut ourInstance = new Pizza_Hut();

    public static Pizza_Hut getInstance() {
        return ourInstance;
    }

    @Override
    public Pizza createMargherita() {
        return null;
    }

    @Override
    public Pizza createProsciutto() {
        return null;
    }

    @Override
    public Pizza createFrutti_di_mare() {
        return null;
    }

    @Override
    public Pizza createCarbonara() {
        return null;
    }

    private Pizza_Hut() {
    }
}
