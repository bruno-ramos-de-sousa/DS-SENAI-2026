import java.util.Scanner;

import static java.lang.Math.round;

public class convr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont = 1, qtd;
        float r, d, v;

        System.out.println("Sistema de conversão de moedas local ");
        System.out.println("Quatas conversões você deseja realizar? ");
        qtd = scanner.nextInt();

        while (cont <= qtd) {
            System.out.println("Qual o valor em reais você deseja converter: R$");
            r = scanner.nextFloat();

            System.out.println("Qual o valor do dolar neste momento? US$");
            d = scanner.nextFloat();

            v = r / d;

            System.out.println("R$" + r + " em reais corresponde a US$" + round(v));
            cont++;
        }
        System.out.println("Sistema encerrado");
    }
}