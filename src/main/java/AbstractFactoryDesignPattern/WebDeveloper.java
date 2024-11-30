package AbstractFactoryDesignPattern;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        return 4000;
    }
    public void name(){
        System.out.println("Salary of Web developer");
    }
}
