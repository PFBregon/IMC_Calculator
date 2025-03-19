package dev.patriciafb.imc.Test;

import dev.patriciafb.imc.views.ResultView;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ResultViewTest {

    @Test
    void testPrintResultMessage() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        String resultadoEsperado = "Tu IMC es: 22.86\nClasificación: Normal weight";
        ResultView resultView = new ResultView();
        resultView.printResultado(resultadoEsperado);
        System.out.println(resultadoEsperado);
        assertTrue(outputStream.toString().trim().contains(resultadoEsperado));

    }
    

    }