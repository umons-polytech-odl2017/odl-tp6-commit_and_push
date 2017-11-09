public class PizzaHut implements Pizzeria{
    private static PizzaHut ourInstance = new PizzaHut();

    public static PizzaHut getInstance() {
        return ourInstance;
    }

    private PizzaHut() {
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
    public Pizza createFruttiDiMare() {
        return null;
    }

    @Override
    public Pizza createCarbonara() {
        return null;
    }
}
