package dev.patriciafb.imc;

import dev.patriciafb.imc.views.HomeView;

public final class App {
    private App() {
    }
    public static void main(String[] args) {
    HomeView homeView = new HomeView(new java.util.Scanner(System.in));
    homeView.printInitMessage();
    }
}
