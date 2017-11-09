public class Domino_Pizza implements Pizzeria{
    private static Domino_Pizza ourInstance = new Domino_Pizza();

    public static Domino_Pizza getInstance() {
        return ourInstance;
    }

    private Domino_Pizza() {
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
}
