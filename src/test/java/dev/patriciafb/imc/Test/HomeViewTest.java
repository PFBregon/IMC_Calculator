package dev.patriciafb.imc.Test;

import org.junit.jupiter.api.Test;

import dev.patriciafb.imc.views.HomeView;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomeViewTest {

    @Test
    void testPrintInitMessage() {
        String simulatedInput = "1.75\n70\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        HomeView initView = new HomeView(new Scanner(System.in));
        initView.printInitMessage();

        String output = outputStream.toString();
        assertTrue(output.contains("Bienvenido. Ahora puedes calcular tu IMC."));
        assertTrue(output.contains("Por favor, introduce tu altura en metros:"));
        assertTrue(output.contains("Por favor, introduce tu peso en kilogramos:"));
    }

} 