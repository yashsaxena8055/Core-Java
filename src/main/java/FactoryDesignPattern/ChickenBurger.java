package FactoryDesignPattern;

public class ChickenBurger implements Burger{
    private String chicken;
    @Override
    public void prepare() {
        System.out.println("Chicken burger is preparting");
    }
}
