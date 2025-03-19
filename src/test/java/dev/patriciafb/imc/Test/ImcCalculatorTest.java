package dev.patriciafb.imc.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import dev.patriciafb.imc.models.ImcCalculator;

public class ImcCalculatorTest {

private final ImcCalculator calculator = new ImcCalculator();

    @Test
    void testCalcularIMC() {
        int peso = 70;
        double altura = 1.75;
        double imc = calculator.calcularIMC(peso, altura);
        assertEquals(22.86, imc);
    }
}
