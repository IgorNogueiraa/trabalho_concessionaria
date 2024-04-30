import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario, senha;

        String usuarioValido = "admin";
        String senhaValida = "1234";
        int tentativas = 5;
        clearScreen();
        System.out.println("Bem-vindo ao Sistema da Celestial Cars");

        for (int i = 0; i < 5; i++) {
            System.out.print("Usuário: ");
            usuario = scanner.nextLine();
            System.out.print("Senha: ");
            senha = scanner.nextLine();

            if (usuario.equals(usuarioValido) && senha.equals(senhaValida)) {
                System.out.println("Login bem-sucedido! Bem-vindo, " + usuario + "!");
                Loja.executar(scanner);
                scanner.close();
                return;
            } else {
                tentativas --;
                System.out.println("Usuário ou senha incorretos. Tente novamente. Tentativas restantes:" + tentativas );
            }
        }

        System.out.println("Número máximo de tentativas atingido. Encerrando o programa.");
        scanner.close();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
