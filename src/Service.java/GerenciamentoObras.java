package service;

import model.ObraDeArte;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciamentoObras {
    private List<ObraDeArte> obras;
    private String arquivo;

    public GerenciamentoObras(String arquivo) {
        this.arquivo = arquivo;
        this.obras = carregarObras();
    }

    public void adicionarObra(ObraDeArte obra) {
        if (obra != null) {
            obras.add(obra);
            salvarObras();
        }
    }

    public void listarObras() {
        if (obras.isEmpty()) {
            System.out.println("Nenhuma obra cadastrada.");
        } else {
            for (ObraDeArte obra : obras) {
                System.out.println(obra);
            }
        }
    }

    public ObraDeArte buscarObraPorTitulo(String titulo) {
        for (ObraDeArte obra : obras) {
            if (obra.getTitulo().equalsIgnoreCase(titulo)) {
                return obra;
            }
        }
        return null;
    }

    public boolean atualizarObra(String titulo, ObraDeArte novaObra) {
        for (int i = 0; i < obras.size(); i++) {
            if (obras.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                obras.set(i, novaObra);
                salvarObras();
                return true;
            }
        }
        return false;
    }

    public boolean excluirObra(String titulo) {
        for (int i = 0; i < obras.size(); i++) {
            if (obras.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                obras.remove(i);
                salvarObras();
                return true;
            }
        }
        return false;
    }

    private void salvarObras() {
        try (FileOutputStream fos = new FileOutputStream(arquivo);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(obras);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<ObraDeArte> carregarObras() {
        try (FileInputStream fis = new FileInputStream(arquivo);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object obj = ois.readObject();
            if (obj instanceof List) {
                return (List<ObraDeArte>) obj;
            } else {
                System.out.println("Erro ao carregar obras. Arquivo inválido.");
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
