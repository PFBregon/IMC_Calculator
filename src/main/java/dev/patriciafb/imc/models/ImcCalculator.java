package dev.patriciafb.imc.models;

public class ImcCalculator {
 
    public double calcularIMC(int peso, double altura) {
        return peso / (altura * altura);
    }

    public String clasificarIMC(double imc) {
        if (imc < 18.5) {
            return "Underweight";
        } else if (imc < 24.9) {
            return "Normal weight";
        } else if (imc < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}