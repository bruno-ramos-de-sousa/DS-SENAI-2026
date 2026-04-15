package parte_3;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String caminho = "arquivo.txt";
        String[] opcoes = {"Escrever", "Ler", "Apagar", "Sair"};
        int escolha;

        do {
            escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma Opção",
                    "Menu do Arquivo",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            switch (escolha) {
                case 0 -> escrever.escreverNoArquivo(caminho);
                case 1 -> ler.lerArquivo(caminho);
                case 2 -> limpar.limparArquivo(caminho);
                default -> JOptionPane.showMessageDialog(null, "Encerrando o programa.");
            }
        } while (escolha == 0 || escolha == 1 || escolha == 2);
    }


}
