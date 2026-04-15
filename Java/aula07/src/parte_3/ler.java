package parte_3;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ler {
    public static void lerArquivo(String caminho) {
        StringBuilder conteudo = new StringBuilder();
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                conteudo.append(linha).append("\n");
            }
            JOptionPane.showMessageDialog(null, conteudo.length() > 0 ? conteudo.toString() : "Arquivo vazio");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
