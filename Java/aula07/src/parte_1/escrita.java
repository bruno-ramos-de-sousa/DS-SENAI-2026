package parte_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class escrita {
    public static void main(String[] args) {
        String caminhoArquivo = "parte_1.escrita.txt"; //Cria o arquivo caso ela não exista

        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            //BufferWriter: Grava dados em bloco
            //FileWriter: Cria o arquivo para parte_1.escrita

            escritor.write("Primeira linha do arquivo.");
            escritor.write("\nSegunda linha parte_1.escrita no Java.");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }

        //try/catch : tratamento de erros de entrada e saida
    }
}