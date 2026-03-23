import java.util.Objects;
import java.util.Scanner;

public class desafio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sen1, email1;

        sen1 = "1234";
        email1 = "teste@gmail.com";

        System.out.println("Você gostaria de realizar um login ou cadastro? ");
        String esc = scanner.nextLine();

        switch (esc) {
            case ("cadastro"):

                System.out.println("----------Cadastro----------");
                System.out.println("Digite seu email: ");
                String email2 = scanner.nextLine();

                System.out.println("Digite sua senha: ");
                String sen2 = scanner.nextLine();

                System.out.println("----------Login----------");

                System.out.println("Digite seu e-mail: ");
                String email3 = scanner.nextLine();

                System.out.println("Digite sua senha: ");
                String sen3 = scanner.nextLine();

                if (Objects.equals(sen3, sen2) && Objects.equals(email3, email2) || Objects.equals(email3, email1) && Objects.equals(sen3, sen1)) {
                    System.out.println("Logado com sucesso!!!!");

                } else {
                    System.out.println("Senha ou e-mail incorreto...");
                }
                break;
            case ("login"):
                System.out.println("----------Login----------");
                System.out.println("Digite seu email: ");
                String email4 = scanner.nextLine();

                System.out.println("Digite sua senha: ");
                String sen4 = scanner.nextLine();

                if (Objects.equals(sen4, sen1) && Objects.equals(email4, email1)) {
                    System.out.println("Logado com sucesso!!!!");
                } else {
                    System.out.println("Senha ou e-mail incorreto...");
                }
                break;
        }
    }
}
