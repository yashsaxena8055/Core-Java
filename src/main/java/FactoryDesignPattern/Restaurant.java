package FactoryDesignPattern;

public abstract class Restaurant {

    public Burger orderBurger(){
       Burger burger = CreateBurger();
       burger.prepare();
       return burger;
    }
    public abstract Burger CreateBurger();
}
