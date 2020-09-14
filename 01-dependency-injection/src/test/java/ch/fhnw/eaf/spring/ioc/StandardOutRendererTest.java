package ch.fhnw.eaf.spring.ioc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@SpringBootTest
public class StandardOutRendererTest {
    @Test
    void testRender(){
        MessageProvider provider = () -> "test";
        StandardOutRenderer renderer = new StandardOutRenderer(provider);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        renderer.render();
        System.out.flush();
        Assertions.assertEquals("test"+System.lineSeparator(), new String(baos.toByteArray()));
    }
}
