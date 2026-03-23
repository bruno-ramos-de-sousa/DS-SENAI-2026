import java.util.Scanner;

public class desaula02pt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua senha: ");

        int senha = scanner.nextInt();
        while (senha != 2002) {
            System.out.println("Senha invalida!!!");
            senha = scanner.nextInt();
        }
        System.out.println("Logado com sucesso!!!");

    }
}
