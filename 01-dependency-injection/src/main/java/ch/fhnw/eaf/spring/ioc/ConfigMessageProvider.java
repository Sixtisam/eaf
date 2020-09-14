package ch.fhnw.eaf.spring.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ConfigMessageProvider implements MessageProvider {
    private final String message;

    public ConfigMessageProvider(@Value("${ch.fhnw.eaf.message}") String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
