import java.util.Scanner;

public class aula02pt2 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int money; float val = 0;
    String menu = """
            -----------------------------
            ######Criança Esperança######
            -----------------------------
            Muito obrigado por ajudar
            [1] para doar R$10,00
            [2] para doar R$20,00
            [3] para doar R$50,00
            [4] para doar outros valores
            [5] para cancelar
            """;

    System.out.println(menu);
    money = scanner.nextInt();

    switch (money) {
        case (1):
            val = 10;
            break;
        case (2):
            val = 20;
            break;
        case (3):
            val = 50;
            break;
        case (4):
            System.out.println("Digite o valor que você deseja doar: ");
            val = scanner.nextFloat();
            break;
        case (5):
            System.out.println("---------Operação encerrada--------");
            break;
        default:
            System.out.println("-----------Opção invalida----------");
            break;
    }
    String menuf = """
            -------------------------------------
            Sua doação foi de\s""" + val + """
            \nMuito obrigado pela sua participação
            -------------------------------------
            """;

    System.out.println(menuf);
    }
}
