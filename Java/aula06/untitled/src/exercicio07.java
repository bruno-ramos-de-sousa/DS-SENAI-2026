void main() {
    Scanner scanner = new Scanner(System.in);
    int cont = 1;

    System.out.println("----------Seja bem vindo ao sistema de trabuada-----------");

    System.out.println("\nDigite o número que você deseja calcular a tabuada");
    int num = scanner.nextInt();

    System.out.println("\n------------------Tabuada do " + num + "----------------------");

    while (cont <= 10) {
        System.out.println(cont + " x " + num + " = " + (num*cont));
        cont++;
    }
}