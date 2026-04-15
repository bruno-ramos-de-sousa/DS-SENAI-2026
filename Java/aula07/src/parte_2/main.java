package parte_2;

import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String caminhoArquivo = "parte2.txt";
        int opcao;

        do {
            System.out.println("""
                    ============ Menu ============
                    
                    Escolha uma opção abaixo:
                    
                    1 - Escrever no arquivo
                    2 - Ler o arquivo
                    3 - limpar arquivo
                    3 - sair
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    String texto = scanner.nextLine();
                    escrever.escrita(caminhoArquivo, texto);
                    break;
                case 2:
                    ler.leitura(caminhoArquivo);
                    break;
                case 3:
                    apagar.apagando(caminhoArquivo);
                    break;
                case 4:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente");
            }
        } while (opcao != 4);

        scanner.close();
    }





}
