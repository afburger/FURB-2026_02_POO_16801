package exercicios.lista03;

public class Musica {

    private static int contador = 1;

    private int id;
    private String titulo;
    private String artista;
    private int duracaoEmSegundos;
    private int reproducoes;

    public Musica(String titulo, String artista, int duracaoEmSegundos) {
        id = contador;
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoEmSegundos = duracaoEmSegundos;
        contador++;
    }
    
    public int getId() {
        return id;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getArtista() {
        return artista;
    }
    
    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public void reproduzir() {
        reproducoes++;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public String getDuracaoFormatada() {
        int minutos = duracaoEmSegundos / 60;
        int segundos = duracaoEmSegundos % 60;
        return String.format("%02d:%02d", minutos, segundos);
    }


}
