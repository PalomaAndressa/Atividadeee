package service;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static void imprimirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public static void imprimirMensagemSemQuebraLinha(String mensagem) {
        System.out.print(mensagem);
    }

    public static String lerEntradaTexto() {
        return scanner.nextLine();
    }

    public static int lerEntradaInteiro() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                imprimirMensagem("Por favor, digite um número inteiro válido.");
            }
        }
    }
}
