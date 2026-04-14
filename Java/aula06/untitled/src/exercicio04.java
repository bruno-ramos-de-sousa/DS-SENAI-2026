void main() {
    Scanner scanner = new Scanner(System.in);
    String nome = "";
    float[] nota = new float[4];
    float media = 0;

    System.out.println("Digite seu nome: ");
    nome = scanner.nextLine();

    for (int n = 0; n < 4; n++)  {
        System.out.println("\nDigite a sua " + (n+1) + "ª nota: ");
        nota[n] = scanner.nextFloat();
        media += nota[n];
    }

    media = media / 4;

    if (media < 5) {
        System.out.println("\nOlá " + nome + ", infelizmente você está reprovado com média: " + media);
    } else {
        System.out.println("\nOlá "  + nome + ", felizmente você está aprovado come média: " + media);
    }
}