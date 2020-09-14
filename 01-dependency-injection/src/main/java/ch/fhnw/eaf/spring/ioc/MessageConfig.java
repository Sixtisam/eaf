package ch.fhnw.eaf.spring.ioc;

import org.apache.logging.log4j.message.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MessageConfig {

    @Bean
    public MessageProvider getMessageProvider(){
        return new HelloWorldProvider();
    }

    @Bean
    public MessageRenderer getMessageRenderer(){
        return new StandardErrorRenderer(getMessageProvider());
    }
}
