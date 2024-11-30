package AnotationBasedDI;

import DependencyInjection.MessageProvider;
import DependencyInjection.SmsProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AnotationBasedConfiguration {
    @Bean
    public MessageProvider getMessageProvider(){
        return new SmsProvider();
    }
}
