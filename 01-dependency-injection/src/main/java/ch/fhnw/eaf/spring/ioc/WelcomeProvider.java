package ch.fhnw.eaf.spring.ioc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class WelcomeProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Herzlich willkommen";
    }
}
