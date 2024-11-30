package AnotationBasedDI;

import DependencyInjection.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyApplication {
    //field-based dependency injection
    //@Autowired
    private MessageProvider messageProvider;

//	constructor-based dependency injection
//	@Autowired
//	public MyApplication(MessageProvider svc){
//		this.messageProvider=svc;
//	}

    @Autowired
    public void setService(MessageProvider svc){
        this.messageProvider=svc;
    }

    public boolean processMessage(String msg, String rec){
        //some magic like validation, logging etc
        return this.messageProvider.sendMessage(msg, rec);
    }
}
