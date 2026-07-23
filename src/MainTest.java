

import main.Main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class MainTest {

    @Test
    void testWelcomeMessage() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        Main.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("Welcome to Task Management System", out.toString().trim());

    }
}
