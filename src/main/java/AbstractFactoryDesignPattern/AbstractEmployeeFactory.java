package AbstractFactoryDesignPattern;

public class AbstractEmployeeFactory {

 public    Employee getWebDev(){
   return new WebDeveloper();

   }
  public   Employee getJavDev(){
        return new JavaDeveloper();
    }
}
