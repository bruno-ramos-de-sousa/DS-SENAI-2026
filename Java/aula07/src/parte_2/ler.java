package parte_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ler {
    public static void leitura(String caminhoArquivo) {
        try(BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
            System.out.println("---------------------------------");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
