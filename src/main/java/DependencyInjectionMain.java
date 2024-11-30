import DependencyInjection.*;

public class DependencyInjectionMain extends Main{
    public static void main(String[] arg){
        SmsServiceInjector smsServiceInjector = new SmsServiceInjector();
       Consumer consumer =  smsServiceInjector.getConsumer();
       consumer.ProcessMessage("6392608722","hello yash");
    }
}
