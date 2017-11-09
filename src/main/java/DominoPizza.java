public class DominoPizza implements Pizzeria {
    private static DominoPizza ourInstance = new DominoPizza();

    public static DominoPizza getInstance() {
        return ourInstance;
    }

    private DominoPizza() {
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
