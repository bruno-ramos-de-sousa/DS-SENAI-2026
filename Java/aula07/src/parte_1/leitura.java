package parte_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class leitura {
    public static void main(String[] args) {
        String caminhoArquivo = "parte_1.escrita.txt"; //Cria o arquivo caso ela não exista

        try(BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
