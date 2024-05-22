package model;

public class Pintura extends ObraDeArte {
    private String tecnica;

    public Pintura(String titulo, String artista, int ano, String localizacao, String tecnica) {
        super(titulo, artista, ano, "Pintura", localizacao);
        this.tecnica = tecnica;
    }

    public String getTecnica() {
        return tecnica;
    }

    @Override
    public String toString() {
        return super.toString() + ", Técnica: " + tecnica;
    }
}

public class Escultura extends ObraDeArte {
    private double altura;
    private double largura;
    private double profundidade;

    public Escultura(String titulo, String artista, int ano, String localizacao,
                     double altura, double largura, double profundidade) {
        super(titulo, artista, ano, "Escultura", localizacao);
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Altura: " + altura + ", Largura: " + largura +
                ", Profundidade: " + profundidade;
    }
}
