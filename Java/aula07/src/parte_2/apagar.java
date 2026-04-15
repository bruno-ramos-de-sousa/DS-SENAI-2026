package parte_2;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class apagar {
    public static void apagando(String caminhoArquivo) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo, false))) {

            JOptionPane.showMessageDialog(null, "Texto apagado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
