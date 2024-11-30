package DependencyInjection;

public class SmsServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MessageApplication(new SmsProvider());
    }
}
