public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and Welcome!!");

        int n1 = 5;
        int n2 = 2;
        float m = (n1 + n2) / 2;

        System.out.println("A média é " + m);

        n1 = 5;
        n1++;
        System.out.println("O primeiro número com incremento +1 é " + n1);

        n1 = 5;
        n1--;
        System.out.println("O primeiro número com decremento -1 é " + n1);

        n1 = 5;
        n1 += n2;
        System.out.println("O primeiro número mais o segundo é " + n1);

        n1 = 5;
        n1 -= n2;
        System.out.println("O primeiro número menos o segundo é " + n1);

        n1 = 5;
        n1 *= n2;
        System.out.println("O primeiro número vezes o segundo é " + n1);

        n1 = 5;
        n1 /= n2;
        System.out.println("O primeiro número dividido pelo segundo é " + n1);
        
        n1 = 5;
        n1 %= n2;
        System.out.println("A sobra do número dividido pelo segundo é " + n1 + " dígito(s)");
    }
}