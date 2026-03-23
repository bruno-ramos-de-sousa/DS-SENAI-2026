import java.util.Scanner;

public class desafio03 {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    int dimdim;

    System.out.println("***Sistema informativo de sugestões***");
    System.out.print("Quanto dinheiro você tem sobrando???  R$");
    dimdim = scanner.nextInt();

    if (dimdim >= 50) {
        System.out.println("Vá ao cinema agora!!!");
    } else {
        System.out.println("Fique em casa vendo tv!!!");
    }
    }
}
