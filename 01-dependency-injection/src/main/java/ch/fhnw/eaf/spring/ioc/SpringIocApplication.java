package ch.fhnw.eaf.spring.ioc;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource("classpath:app-config.xml")
public class SpringIocApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringIocApplication.class, args);
    }

    private final MessageRenderer renderer;

    @Autowired
    public SpringIocApplication(MessageRenderer renderer) {
        this.renderer = renderer;
    }

    @Override
    public void run(String... args) throws Exception {
        renderer.render();
    }
}
