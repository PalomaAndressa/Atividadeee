package view;

import java.util.Scanner;

import Model.ObraDeArte;
import Service.java.GerenciamentoObras;

public class Principal {
    public static void main(String[] args) {
        String arquivo = "obras_de_arte.dat";
        GerenciamentoObras gerenciamento = new GerenciamentoObras(arquivo);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Cadastrar nova obra");
            System.out.println("2. Listar obras");
            System.out.println("3. Buscar obra por título");
            System.out.println("4. Atualizar obra");
            System.out.println("5. Excluir obra");
            System.out.println("6. Sair");

            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    ObraDeArte novaObra = CadastroObra.cadastrarObra();
                    if (novaObra != null) {
                        gerenciamento.adicionarObra(novaObra);
                    }
                    break;
                case "2":
                    gerenciamento.listarObras();
                    break;
                case "3":
                    System.out.print("Digite o título da obra que deseja buscar: ");
                    String tituloBusca = scanner.nextLine();
                    ObraDeArte obraEncontrada = gerenciamento.buscarObraPorTitulo(tituloBusca);
                    if (obraEncontrada != null) {
                        System.out.println("Obra encontrada: " + obraEncontrada);
                    } else {
                        System.out.println("Obra não encontrada.");
                    }
                    break;
                case "4":
                    System.out.print("Digite o título da obra que deseja atualizar: ");
                    String tituloAtualizar = scanner.nextLine();
                    ObraDeArte obraAtualizar = gerenciamento.buscarObraPorTitulo(tituloAtualizar);
                    if (obraAtualizar != null) {
                        ObraDeArte obraAtualizada = CadastroObra.cadastrarObra();
                        if (gerenciamento.atualizarObra(tituloAtualizar, obraAtualizada)) {
                            System.out.println("Obra atualizada com sucesso.");
                        } else {
                            System.out.println("Erro ao atualizar a obra.");
                        }
                    } else {
                        System.out.println("Obra não encontrada.");
                    }
                    break;
                case "5":
                    System.out.print("Digite o título da obra que deseja excluir: ");
                    String tituloExcluir = scanner.nextLine();
                    if (gerenciamento.excluirObra(tituloExcluir)) {
                        System.out.println("Obra excluída com sucesso.");
                    } else {
                        System.out.println("Obra não encontrada.");
                    }
                    break;
                case "6":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
