package DependencyInjection;

public class MessageApplication implements Consumer {
    private MessageProvider messageProvider;
    public MessageApplication(MessageProvider messageProvider){
        this.messageProvider = messageProvider;
    }

    @Override
    public void ProcessMessage(String recipient, String content) {
        messageProvider.sendMessage(recipient,content);
    }
}
