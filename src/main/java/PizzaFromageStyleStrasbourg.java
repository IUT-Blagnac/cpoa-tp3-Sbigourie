public class PizzaFromageStyleStrasbourg extends Pizza{
    public PizzaFromageStyleStrasbourg() {
        this.garnitures.add(" Mozzarella en lamelles");
        this.name = ("Pizza pâte style Strasbourg et fromage");
        System.out.println("Préparation de Pizza pâte style Strasbourg et fromage");
    }

    @Override
    public void cuire(){
        System.out.println("Cuisson 25 minutes à 180 degrés");
    }

    @Override
    public void couper(){
        System.out.println("Découpage en parts carrées");
    }

    @Override
    public void emballer(){
        System.out.println("Emballage dans une boîte officielle");
    }

}
