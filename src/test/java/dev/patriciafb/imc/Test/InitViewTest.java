package dev.patriciafb.imc.Test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class InitViewTest {
    
    @Test
    @DisplayName("Test print welcome message")
    void testInitViewPrint() {
        String simulatedInput = "1.75\n70.0\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        Scanner scanner = new Scanner(System.in);
        InitView initView = new InitView(scanner);
        initView.printInitMessage();
        scanner.close();
    }
}