package view;

import java.util.Scanner;

import Model.Escultura;
import Model.ObraDeArte;
import Model.Pintura;

public class CadastroObra {
    public static ObraDeArte cadastrarObra() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o título da obra: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o artista da obra: ");
        String artista = scanner.nextLine();

        System.out.print("Digite o ano de criação da obra: ");
        int ano = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o tipo da obra (Pintura, Escultura): ");
        String tipo = scanner.nextLine();

        System.out.print("Digite a localização da obra no museu: ");
        String localizacao = scanner.nextLine();

        switch (tipo.toLowerCase()) {
            case "pintura":
                System.out.print("Digite a técnica da pintura: ");
                String tecnica = scanner.nextLine();
                return new Pintura(titulo, artista, ano, tipo, localizacao, tecnica);
            case "escultura":
                System.out.print("Digite o material da escultura: ");
                String material = scanner.nextLine();
                return new Escultura(titulo, artista, ano, tipo, localizacao, material);
            default:
                System.out.println("Tipo de obra desconhecido.");
                return null;
        }
    }
}

