package ch.fhnw.eaf.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class StandardErrorRenderer implements MessageRenderer {

    private final MessageProvider provider;

    @Autowired
    public StandardErrorRenderer(MessageProvider provider) {
        this.provider = provider;
    }

    @Override
    public void render() {
        System.err.println(provider.getMessage());
    }
}
