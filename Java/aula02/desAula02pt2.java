import java.util.Scanner;
public class desaula02pt2 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    char btn;
    int btnc;

    String menu = """
            Escolha a lampada que deseja ligar:
            [1] lâmpada Azul
            [2] Lâmpada Verde
            [3] Lâmpada Amarela
            [4] Lâmpada Vermelha
            """;

    System.out.println("Ligue o equipamento:...");
    btn = scanner.nextLine().charAt(0);

    System.out.println("Equipamento ligado com sucesso!!!");
    System.out.println(menu);
    btnc = scanner.nextInt();

    switch (btnc) {
        case(1):
            System.out.println("Lâmpada Azul ligada!!!");
            break;
        case(2):
            System.out.println("Lâmpada Verde ligada!!!");
            break;
        case(3):
            System.out.println("Lâmpada Amarela ligada!!!");
            break;
        case(4):
            System.out.println("Lâmpada Vermelha ligada!!!");
            break;
        default:
            System.out.println("Lâmpada inexisente");
        }
    System.out.println("---!!Equipamento desligado!!---");
    System.out.println("Equipamento desligado com sucesso");

    }
}