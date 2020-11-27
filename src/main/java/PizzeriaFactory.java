public class PizzeriaFactory {

    public static final PizzeriaFactory insance = new PizzeriaFactory();

    public static Pizzeria creer(String nom){
        if(nom.equals("Brest")){
            return new PizzeriaBrest();
        }
        else{
            return new PizzeriaStrasbourg();
        }

    }

    public static PizzeriaFactory getInstance() {
        return insance;
    }
}
