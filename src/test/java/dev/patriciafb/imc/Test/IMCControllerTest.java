package dev.patriciafb.imc.Test;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import dev.patriciafb.imc.controllers.ImcController;
import dev.patriciafb.imc.models.ImcCalculator;
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
    void testCalcularIMC_ConPesoBajo() {
        int peso = 45;
        double altura = 1.60;
        String resultado = controller.calcularIMC(peso, altura);
        assertEquals("Tu IMC es: 17.58\nClasificación: Underweight", resultado);
    }
}