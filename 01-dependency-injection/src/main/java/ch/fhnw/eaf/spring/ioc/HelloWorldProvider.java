package ch.fhnw.eaf.spring.ioc;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World";
    }
}
