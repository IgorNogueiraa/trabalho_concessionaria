import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Venda {
    private static List<String> vendas = new ArrayList<>();

    public static void gerenciarVendas(Scanner scanner) {
        int opcao;

        do {
            System.out.println("=== Gerenciar Vendas ===");
            System.out.println("1 - Registrar Venda");
            System.out.println("2 - Listar Vendas");
            System.out.println("3 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            clearScreen();

            switch (opcao) {
                case 1:
                    registrarVenda(scanner);
                    break;
                case 2:
                    listarVendas();
                    break;
                case 3:
                    Loja.executar(scanner);
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 3);
    }

    private static void registrarVenda(Scanner scanner) {
        System.out.print("Digite os detalhes da venda: ");
        String detalhesVenda = scanner.next();
        vendas.add(detalhesVenda);
        System.out.println("Venda registrada com sucesso!");
    }

    private static void listarVendas() {
        System.out.println("=== Lista de Vendas ===");
        if (vendas.isEmpty()) {
            System.out.println("Nenhuma venda registrada.");
        } else {
            for (String venda : vendas) {
                System.out.println(venda);
            }
        }
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
