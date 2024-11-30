import FactoryDesignPattern.Burger;
import FactoryDesignPattern.ChickenResturant;
import FactoryDesignPattern.Restaurant;
import FactoryDesignPattern.VegRestaurant;

public class FactoryDesignPatternMain extends Main {
    public static void main(String a[]){
//        Burger chicken = new ChickenBurger();
        Restaurant restaurant = new VegRestaurant();
        Burger burger = restaurant.orderBurger();

    }
}
