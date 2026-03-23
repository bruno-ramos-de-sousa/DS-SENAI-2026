import java.util.Scanner;

public class tstwhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cont = 0, n, m;
        System.out.println("Digite um número: ");
        n = scanner.nextInt();
        System.out.println("Essa é a tabuada do " + n);
        while (cont < 10) {
            cont++;
            m = cont * n;
            System.out.println(n + " x " + cont + " = " + m);
        }
    }
}
