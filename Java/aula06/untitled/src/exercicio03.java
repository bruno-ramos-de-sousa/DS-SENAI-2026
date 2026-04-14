void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    String nome = scanner.nextLine();
    System.out.println("\nDigite sua idade: ");
    int idade = scanner.nextInt();

    System.out.println("\nOlá " + nome + ", você tem " + idade + " anos. Seja bem vindo! \nComo você está? ");
}