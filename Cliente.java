import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cliente {
    private static Map<String, String> clientes = new HashMap<>();

    public static void gerenciarClientes(Scanner scanner) {
        int opcao;

        do {
            System.out.println("=== Gerenciar Clientes ===");
            System.out.println("1 - Adicionar Cliente");
            System.out.println("2 - Remover Cliente");
            System.out.println("3 - Listar Clientes");
            System.out.println("4 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            clearScreen();
            
            switch (opcao) {
                case 1:
                    adicionarCliente(scanner);
                    break;
                case 2:
                    removerCliente(scanner);
                    break;
                case 3:
                    listarClientes();
                    break;
                case 4:
                    Loja.executar(scanner);
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 4);
    }

    private static void adicionarCliente(Scanner scanner) {
        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.next();
        System.out.print("CPF do cliente: ");
        String cpfCliente = scanner.next();

        clientes.put(cpfCliente, nomeCliente);
        System.out.println("Cliente adicionado com sucesso!");
    }


    private static void removerCliente(Scanner scanner) {
        System.out.print("CPF do cliente que deseja remover: ");
        String cpfCliente = scanner.next();

        if (clientes.containsKey(cpfCliente)) {
            clientes.remove(cpfCliente);
            System.out.println("Cliente removido com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private static void listarClientes() {
        System.out.println("=== Lista de Clientes ===");
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Map.Entry<String, String> entry : clientes.entrySet()) {
                System.out.println("CPF: " + entry.getKey() + ", Nome: " + entry.getValue());
            }
        }
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
