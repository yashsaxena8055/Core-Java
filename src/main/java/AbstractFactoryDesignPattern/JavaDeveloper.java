package AbstractFactoryDesignPattern;

public class JavaDeveloper implements Employee {
    @Override
    public int salary() {
        return 5000;
    }
    public void name(){
        System.out.println("Salary of Java developer");
    }
}
