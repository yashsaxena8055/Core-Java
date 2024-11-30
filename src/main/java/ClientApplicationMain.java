import AnotationBasedDI.AnotationBasedConfiguration;
import AnotationBasedDI.MyApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplicationMain extends Main {
    public static void main(String arg[]){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnotationBasedConfiguration.class);
        MyApplication app = context.getBean(MyApplication.class);

        app.processMessage("6392608722", "Hi yash!");

        //close the context
        context.close();
    }
}
