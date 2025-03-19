package dev.patriciafb.imc.controllers;
import java.util.Locale;

import dev.patriciafb.imc.models.ImcCalculator;

public class ImcController {
    private ImcCalculator calculator;

    public ImcController(ImcCalculator calculator) {
        this.calculator = calculator;
    }

    public String calcularIMC(int peso, double altura) {
        double imc = calculator.calcularIMC(peso, altura);
        String clasificacion = calculator.clasificarIMC(imc);
        return String.format(Locale.US,"Tu IMC es: %.2f\nClasificación: %s", imc, clasificacion);
    }

}