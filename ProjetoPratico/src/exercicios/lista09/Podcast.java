package exercicios.lista09;

public class Podcast extends Conteudo{

    private int numeroEpisodio;
    private String apresentador;

    public Podcast(String apresentador, int numeroEpisodio, int duracaoEmSegundos, String titulo) {
        super(titulo, duracaoEmSegundos);
        if (numeroEpisodio < 1) {
            throw new IllegalArgumentException("Número do episódio deve ser maior ou igual a 1");
        }
        this.numeroEpisodio = numeroEpisodio;
        this.apresentador = apresentador;
    }

    public String getApresentador() {
        return apresentador;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    @Override
    public String toString() {
        return super.toString() + " episódio: " + numeroEpisodio + " apresentador: " + apresentador;
    }

    @Override
    public String getCreditos() {
        return numeroEpisodio + " - " + apresentador;
    }
}
