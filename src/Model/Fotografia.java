package model;

public class Fotografia extends ObraDeArteBase {
    private String tecnica;
    private String resolucao;

    public Fotografia(String titulo, String artista, int ano, String tipo, String localizacao, String tecnica, String resolucao) {
        super(titulo, artista, ano, tipo, localizacao);
        this.tecnica = tecnica;
        this.resolucao = resolucao;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Técnica: " + tecnica + ", Resolução: " + resolucao;
    }
}

