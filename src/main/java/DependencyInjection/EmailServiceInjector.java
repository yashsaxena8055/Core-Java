package DependencyInjection;

public class EmailServiceInjector implements MessageServiceInjector{
    @Override
    public Consumer getConsumer() {
        return new MessageApplication(new EmailProvider());
    }
}
