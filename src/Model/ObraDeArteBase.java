package Model; // Corrigido para o pacote Model

public abstract class ObraDeArteBase implements ObraDeArte {
    private String titulo;
    private String artista;
    private int ano;
    private String tipo;
    private String localizacao;

    public ObraDeArteBase(String titulo, String artista, int ano, String tipo, String localizacao) {
        this.titulo = titulo;
        this.artista = artista;
        this.ano = ano;
        this.tipo = tipo;
        this.localizacao = localizacao;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getArtista() {
        return artista;
    }

    @Override
    public int getAno() {
        return ano;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public String getLocalizacao() {
        return localizacao;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Artista: " + artista + ", Ano: " + ano +
                ", Tipo: " + tipo + ", Localização: " + localizacao;
    }
}
