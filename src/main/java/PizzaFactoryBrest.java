public class PizzaFactoryBrest extends PizzaFactory{


    @Override
    public Pizza creerPizza(String type) {
        return new PizzaFromageStyleBrest();
    }
}
