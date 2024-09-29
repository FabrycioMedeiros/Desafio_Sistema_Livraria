package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuUtil {

    private static final Scanner scanner = new Scanner(System.in);

    public static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Listar livros disponíveis");
        System.out.println("2. Realizar empréstimo");
        System.out.println("3. Listar clientes");
        System.out.println("4. Histórico de empréstimos");
        System.out.println("5. Sair");
        System.out.println("6. Buscar livro por título");
        System.out.println("7. Buscar livro por autor");
        System.out.println("8. Devolver livro");
        System.out.print("Escolha uma opção: ");
    }

    public static int capturarOpcao() {
        int opcao = -1;
        boolean valido = false;
        while (!valido) {
            try {
                opcao = scanner.nextInt();
                scanner.nextLine();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next();
            }
        }
        return opcao;
    }

    public static String capturarString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static int capturarInt(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, insira um número.");
            scanner.next();
        }
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }
}
