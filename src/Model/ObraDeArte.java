package model;

import java.io.Serializable;

public abstract class ObraDeArte implements Serializable {
    private String titulo;
    private String artista;
    private int ano;
    private String tipo;
    private String localizacao;

    public ObraDeArte(String titulo, String artista, int ano, String tipo, String localizacao) {
        this.titulo = titulo;
        this.artista = artista;
        this.ano = ano;
        this.tipo = tipo;
        this.localizacao = localizacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getAno() {
        return ano;
    }

    public String getTipo() {
        return tipo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Artista: " + artista + ", Ano: " + ano +
                ", Tipo: " + tipo + ", Localização: " + localizacao;
    }
}
