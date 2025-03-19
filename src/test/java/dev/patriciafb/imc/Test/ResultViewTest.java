package dev.patriciafb.imc.Test;

import dev.patriciafb.imc.views.Views.ResultView;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ResultViewTest {

    @Test
    void testPrintResultMessage() {
        ResultView resultView = new ResultView();
        resultView.printResultMessage(24.49);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        resultView.printResultMessage(24.49);
        String output = outputStream.toString();
        assertTrue(output.contains("Tu IMC es: 24.49"));
    }
    

    }