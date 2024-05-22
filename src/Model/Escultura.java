package Model;

public class Escultura extends ObraDeArteBase {
    private String material;

    public Escultura(String titulo, String artista, int ano, String tipo, String localizacao, String material) {
        super(titulo, artista, ano, tipo, localizacao);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return super.toString() + ", Material: " + material;
    }
}
