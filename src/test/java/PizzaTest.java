import org.junit.Test;

public class PizzaTest {

    @Test
    public void test(){
        Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().creer("Brest");
        Pizzeria boutiqueStrasbourg = PizzeriaFactory.getInstance().creer("Strasbourg");

        Pizza pizza = boutiqueBrest.commanderPizza("fromage");
        System.out.println("JMB a commandé une " + pizza.getNom() + "\n");

        pizza = boutiqueStrasbourg.commanderPizza("fromage");
        System.out.println("JMI a commandé une " + pizza.getNom() + "\n");
    }



}
