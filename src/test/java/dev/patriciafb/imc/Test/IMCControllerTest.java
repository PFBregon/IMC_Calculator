package dev.patriciafb.imc.Test;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import dev.patriciafb.imc.controllers.ImcController;
import dev.patriciafb.imc.models.ImcCalculator;

public class IMCControllerTest {

    @Test
    void testProcesarIMC() {
        ImcCalculator calculator = new ImcCalculator();
        ImcController controller = new ImcController(calculator);

        String resultado = controller.calcularIMC(70, 1.75);

        assertThat(resultado, containsString("Tu IMC es: 22.86"));
        assertThat(resultado, containsString("Clasificación: Peso normal"));
    }
}
