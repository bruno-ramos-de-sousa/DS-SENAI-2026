import java.util.Scanner;

public class aula02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int op, n1, n2 = 0;
        float res = 0;

        System.out.println("-----Calculadora em java aula 02-----");
        System.out.println("Digite o primeiro número para a calculadora");
        n1 = scanner.nextInt();

        System.out.println("Digite o segundo número para a calculadora");
        n2 = scanner.nextInt();

        System.out.println("Digite o operador para o calculo \n1) Adição (+) \n2) Subtração (-) \n3) Divisão (/) \n4) Multiplicação (*)");
        op = scanner.nextInt();

        if (op == 3 && n2 == 0) {
            System.out.println("Não se deve dividir por 0 \nOperação invalida");
        } else {

            switch (op) {
                case (1):
                    res = n1 + n2;
                    break;
                case (2):
                    res = n1 - n2;
                    break;
                case (3):
                    res = (float) n1 / n2;
                    break;
                case (4):
                    res = n1 * n2;
                    break;
                default:
                    System.out.println("Operação invalida");
                    break;

            }
            System.out.println("O resultado dessa equação é equivalente a " + res);
        }
    }
}
