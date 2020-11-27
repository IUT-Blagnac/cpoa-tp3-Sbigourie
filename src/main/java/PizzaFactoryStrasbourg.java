public class PizzaFactoryStrasbourg extends PizzaFactory{

    @Override
    public Pizza creerPizza(String type) {
        return new PizzaFromageStyleStrasbourg();
    }
}
