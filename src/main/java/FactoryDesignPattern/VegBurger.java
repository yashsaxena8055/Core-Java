package FactoryDesignPattern;

public class VegBurger implements Burger{

    private String patty;
    @Override
    public void prepare() {
        System.out.println("Veg burger is preparing");
    }
}
