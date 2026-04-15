package parte_3;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class escrever {
    public static void escreverNoArquivo(String caminho) {
        String texto = JOptionPane.showInputDialog("Digite o texto para salvar");
        if (texto != null && !texto.isBlank()) {
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminho, true))) {
                escritor.write(texto);
                escritor.newLine();
                JOptionPane.showMessageDialog(null, "Texto salvo com sucesso");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro" + e.getMessage());
            }
        }
    }
}
