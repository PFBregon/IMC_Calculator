package dev.patriciafb.imc.Test;

import dev.patriciafb.imc.controllers.ImcController;
import dev.patriciafb.imc.models.ImcCalculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IMCControllerTest {

    private ImcCalculator calculator;
    private ImcController controller;

    @BeforeEach
    void setUp() {
        calculator = new ImcCalculator();
        controller = new ImcController(calculator);
    }

    @Test
    void testCalcularIMC_ConPesoYAlturaValidos() {
        int peso = 70;
        double altura = 1.75;
        String resultado = controller.calcularIMC(peso, altura);
        assertEquals("Tu IMC es: 22.86\nClasificación: Normal weight", resultado);
    }

    @Test
    void testCalcularIMC_ExtremeUnderweight() {
        int peso = 45;
        double altura = 1.75;
        String resultado = controller.calcularIMC(peso, altura);
        assertEquals("Tu IMC es: 14.69\nClasificación: Extreme underweight", resultado);
    }

    @Test
    void testCalcularIMC_ConPesoBajo() {
        int peso = 53;
        double altura = 1.75;
        String resultado = controller.calcularIMC(peso, altura);
        assertEquals("Tu IMC es: 17.31\nClasificación: Underweight", resultado);
    }

    @Test
    void testCalcularIMC_Overweight() {
        int peso = 85;
        double altura = 1.75;
        String resultado = controller.calcularIMC(peso, altura);
        assertEquals("Tu IMC es: 27.76\nClasificación: Overweight", resultado);
    }

    @Test
    void testCalcularIMC_Obesity() {
        int peso = 100;
        double altura = 1.75;
        String resultado = controller.calcularIMC(peso, altura);
        assertEquals("Tu IMC es: 32.65\nClasificación: Obesity", resultado);
    }
}