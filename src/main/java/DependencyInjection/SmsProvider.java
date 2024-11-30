package DependencyInjection;

public class SmsProvider implements MessageProvider{
    @Override
    public boolean sendMessage(String recipient, String content) {
        System.out.println("Sending sms to "+recipient);
        return true;
    }
}
