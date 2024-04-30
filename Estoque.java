import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Estoque {
    private static Map<String, Integer> produtos = new HashMap<>();

    public static void verificarEstoque(Scanner scanner) {
        int opcao;

        do {
            System.out.println("Bem-vindo ao Sistema de Estoque da Celestial Cars");
            System.out.println("1 - Cadastro de Veiculos");
            System.out.println("2 - Remover Veiculo");
            System.out.println("3 - Exibir Estoque de Veiculos");
            System.out.println("4 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            clearScreen();
            switch (opcao) {
                case 1:
                    adicionarProduto(scanner);
                    break;
                case 2:
                    removerProduto(scanner);
                    break;
                case 3:
                    exibirEstoque();
                    break;
                case 4:
                    Loja.executar(scanner);
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 4);
    }

    private static void adicionarProduto(Scanner scanner) {
        System.out.print("Nome do produto: ");
        String nomeProduto = scanner.next();
        System.out.print("Ano do Veiculo: ");
        int Ano = scanner.nextInt();
       

        produtos.put(nomeProduto, Ano);
        System.out.println("Produto adicionado ao estoque.");
    }

    private static void removerProduto(Scanner scanner) {
        System.out.print("Nome do produto: ");
        String nomeProduto = scanner.next();

        if (produtos.containsKey(nomeProduto)) {
            produtos.remove(nomeProduto);
            System.out.println("Produto removido do estoque.");
        } else {
            System.out.println("Produto não encontrado no estoque.");
        }
    }

    private static void exibirEstoque() {
        System.out.println("Estoque:");
        for (Map.Entry<String, Integer> entry : produtos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
