package FactoryDesignPattern;

public class ChickenResturant extends Restaurant{
    @Override
    public Burger CreateBurger() {
        return new ChickenBurger();
    }
}
