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
        assertEquals(22.86, imc, 0.01);
    }

       public double calcularIMC(int peso, double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor que 0");
        }return peso / (altura * altura);
    }

    @Test
    void testExtremeUnderweight() {
        assertEquals("Extreme underweight", calculator.clasificarIMC(15.99));
        assertEquals("Underweight", calculator.clasificarIMC(16.0));          
    }

    @Test
    void testUnderweight() {
        assertEquals("Underweight", calculator.clasificarIMC(18.49));
        assertEquals("Normal weight", calculator.clasificarIMC(18.5));          
    }
}
