package abstraction;

import java.util.Objects;

public interface Flying {
//    static String type="23";
     void startFlying();
     void stopFlying();
/*
 Inferface doesnt have there own instance variable they just have static constants if some method wants
 to have some dynamic data they have ask in the default method parameter , due which that method or implementation
 is not so abstract

 But in case of abstract classed we can intialise there variable with instance variable with the help of constructors
*/


     default long heightToFly(String type){
         if(Objects.equals(type, "batman"))
            return 10L;
         else
             return 20L;
     }
}
