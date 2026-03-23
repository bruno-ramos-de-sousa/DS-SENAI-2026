import java.util.Scanner;

public class aula01pt2 {
    public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    String nome = leia.nextLine(); //nextLine entrada de dados do tipo texto

    System.out.println("Digite sua idade: ");
    int idade = leia.nextInt();

    System.out.println(nome + " você tem " + idade + " anos.");
    }
}
