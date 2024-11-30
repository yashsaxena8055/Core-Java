package DependencyInjection;

public class EmailProvider implements MessageProvider{
    @Override
    public boolean sendMessage(String recipient, String content) {
        System.out.println("Sending email to "+recipient);
        return true;
    }
}
