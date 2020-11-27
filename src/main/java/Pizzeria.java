/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public abstract class Pizzeria {

	private PizzaFactory fabrique;
		public Pizzeria(PizzaFactory fabrique){
			this.fabrique = fabrique;
		}


	/**
         * @param type
         * @return a Pizza object according to the type
         */


	public Pizza commanderPizza(String type) {
		Pizza pizza;
		pizza = fabrique.creerPizza(type);
		pizza.preparer();
		pizza.cuire();
		pizza.couper();
		pizza.emballer();

		return pizza;
	}

}