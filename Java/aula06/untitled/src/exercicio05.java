void menu() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("""
            ================== Menu ===================
            
            Escolha uma das seguintes opções para
            exibir um comentario sobre
            
            1) Invencivel
            2) The Boys
            3) Game of Thrones
            """);
}

void main() {
    Scanner scanner = new Scanner(System.in);
    String pause = "";

    menu();
    char op = scanner.nextLine().charAt(0);

    switch (op) {
        case ('1'): {
            System.out.println("\nSerie com um orçamento extremamente acima da média para sua animação, mais, não deixa a desejar no quesito de history telling e enredo.");
            pause = scanner.nextLine();
            break;
        }
        case ('2'): {
            System.out.println("\nSerie violenta com ótimas cenas de ação. Um ponto muito forte é a performace dos atores.");
            pause = scanner.nextLine();
            break;
        }
        case ('3'): {
            System.out.println("\nA histótia não deixa nenhum burraco, todos os acontecimentos desde o primeiro episódio contribuem para o final da história. Ótima escolha para quem gosta de histórias que furam a bolha.");
            pause = scanner.nextLine();
            break;
        }
        default: {
            System.out.println("\nOpção invalida.");
            break;
        }
    }
}