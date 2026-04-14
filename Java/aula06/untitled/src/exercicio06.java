void menu() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("""
                ================== Menu ===================
                
                Escolha uma das seguintes opções para
                exibir um comentario sobre
                
                1) Invencivel
                2) The Boys
                3) Game of Thrones
                4) Sair
                """);
}

void main() {
    Scanner scanner = new Scanner(System.in);
    boolean sair = false;
    String pause = "";

    do {
        menu();
        char op = scanner.nextLine().charAt(0);

        switch (op) {
            case ('1'): {
                System.out.println("\nSerie com um orçamento extremamente acima da média para sua animação, mais, não deixa a desejar no quesito de history telling e enredo.");
                pause = scanner.nextLine();
                break;
            }
            case ('2'): {
                System.out.println("\nSerie violenta com ótimas cenas de ação. Um ponto muito forte é performace dos atores.");
                pause = scanner.nextLine();
                break;
            }
            case ('3'): {
                System.out.println("\nA histótia não deixa nenhum burraco, todos os acontecimentos desde o primeiro episódio contribuem para o final da história. Ótima escolha para quem gosta de histórias que furam a bolha.");
                pause = scanner.nextLine();
                break;
            }
            case ('4'): {
                System.out.println("\nSaindo do sitema. Muito obrigado e volte sempre!!");
                sair = true;
                break;
            }
            default: {
                System.out.println("\nInsira uma opção valida.");
                break;
            }
        }
    } while (!sair);
}