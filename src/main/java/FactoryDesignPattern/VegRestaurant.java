package FactoryDesignPattern;

public class VegRestaurant extends Restaurant{
    @Override
    public Burger CreateBurger() {
        return new VegBurger();
    }
}
