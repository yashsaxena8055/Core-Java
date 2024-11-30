import AbstractFactoryDesignPattern.AbstractEmployeeFactory;

public class AbstractFactoryPaternMain extends Main {
    public static void main(String Arg[]){
        AbstractEmployeeFactory employee = new AbstractEmployeeFactory();

        System.out.println(employee.getJavDev().salary());
    }
}
