public class PizzaFromageStyleBrest extends Pizza {

    public PizzaFromageStyleBrest() {
        this.garnitures.add(" Parmigiano reggiano râpé");
        this.name = ("Pizza sauce style brest et fromage");
        System.out.println("Préparation de Pizza sauce style brest et fromage");
    }

    @Override
    public void cuire(){
        System.out.println("Cuisson 25 minutes à 180 degrés");
    }

    @Override
    public void couper(){
        System.out.println("Découpage en parts triangulaires");
    }

    @Override
    public void emballer(){
        System.out.println("Emballage dans une boîte officielle");
    }


}
