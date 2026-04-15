package parte_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class escrever {
    public static void escrita(String caminhoArquivo, String texto) {
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo, true))) {

            escritor.write(texto);
            escritor.newLine();
            System.out.println("\nTexto gravado com sucesso");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
