package dev.patriciafb.imc.views;

import java.util.Locale;
import java.util.Scanner;

import dev.patriciafb.imc.controllers.ImcController;
import dev.patriciafb.imc.models.ImcCalculator;

public class HomeView {
    private final Scanner scanner;

    public HomeView(Scanner scanner) {
        this.scanner = scanner;
        this.scanner.useLocale(Locale.US);
    }

    public void printInitMessage() {
        System.out.println("Bienvenido. Ahora puedes calcular tu IMC.");
        System.out.println("Por favor, introduce tu altura en metros:");
        double altura = scanner.nextDouble();
        System.out.println("Por favor, introduce tu peso en kilogramos:");
        double peso = scanner.nextDouble();
        ImcController controller = new ImcController(new ImcCalculator());
        String resultado = controller.calcularIMC((int)peso, altura);
        ResultView resultView = new ResultView();
        resultView.printResultado(resultado);
        
    }
}



