package exercicios.lista09;

public abstract class Conteudo {

    private static int contador = 0;

    private int id;
    private String titulo;
    private int duracaoEmSegundos;
    private int reproducoes;

    public Conteudo(String titulo, int duracaoEmSegundos) {
        setTitulo(titulo);
        setDuracaoEmSegundos(duracaoEmSegundos);
        // So consome um id depois de validar: se o construtor lanca, nenhum id e gasto.
        this.id = ++contador;
    }

    // reproduzir() e final: garante que o contador nunca seja esquecido por uma subclasse.
    public final void reproduzir() {
        reproducoes++;
        System.out.println("Reproduzindo: " + getTitulo() + " - " + getCreditos());
    }

    public abstract String getCreditos();

    protected void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título inválido. O título não pode ser vazio.");
        }
        this.titulo = titulo;
    }

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        if (duracaoEmSegundos <= 0) {
            throw new IllegalArgumentException(
                    "Duração inválida: " + duracaoEmSegundos + ". A duração deve ser maior que zero.");
        }
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public String getDuracaoFormatada() {
        int minutos = getDuracaoEmSegundos() / 60;
        int segundos = getDuracaoEmSegundos() % 60;
        return String.format("%02d:%02d", minutos, segundos);
    }

    @Override
    public String toString() {
        return "[" + id + "] " + titulo + " (" + getDuracaoFormatada() + ")";
    }

}
