package exercicios.lista09;

public class Musica extends Conteudo {

    private String artista;
    private String album;
    private int reproducoes;

    public Musica(String titulo, String artista, String album, int duracaoEmSegundos) {
        super(titulo, duracaoEmSegundos);
        if (artista == null || artista.trim().isEmpty()) {
            throw new IllegalArgumentException("Artista inválido. O artista não pode ser vazio.");
        }

        this.artista = artista;
        this.album = album;

    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    @Override
    public String toString() {
        return super.toString() + " álbum: " + album + " artista: " + artista;
    }

    @Override
    public String getCreditos() {
        return artista + " - " + album;
    }
}
