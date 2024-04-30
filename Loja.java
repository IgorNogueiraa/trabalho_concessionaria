import java.util.Scanner;

public class Loja {
    public static void executar(Scanner scanner) {
        int opcao;

        do {
            System.out.println("Bem-vindo à Celestial Cars");
            System.out.println("1 - Estoque");
            System.out.println("2 - Clientes");
            System.out.println("3 - Venda");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            clearScreen();
            
            switch (opcao) {
                case 1:
                    Estoque.verificarEstoque(scanner);
                    break;
                case 2:
                    Cliente.gerenciarClientes(scanner);
                    break;
                case 3:
                    Venda.gerenciarVendas(scanner);
                    break;
                case 4:
                    System.out.println("Obrigado por Trabalhar Conosco!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 4);
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
