package dev.patriciafb.imc.views;

import java.util.Locale;
import java.util.Scanner;

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
        System.out.println("Altura: " + altura + " m, Peso: " + peso + " kg.");
    }
}



