package parte_3;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class limpar {
    public static void limparArquivo(String caminho) {
        String texto = "";
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminho, false))) {
            escritor.write(texto);
            escritor.newLine();
            JOptionPane.showMessageDialog(null, "Texto apagado com sucesso");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro" + e.getMessage());
        }
    }
}

