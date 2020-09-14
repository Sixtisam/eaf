package ch.fhnw.eaf.spring.ioc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@SpringBootTest
public class StandardErrorRendererTest {
    @Test
    void testRender(){
        MessageProvider provider = () -> "test";
        StandardErrorRenderer renderer = new StandardErrorRenderer(provider);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setErr(new PrintStream(baos));

        renderer.render();
        System.err.flush();
        Assertions.assertEquals("test"+System.lineSeparator(), new String(baos.toByteArray()));
    }
}
