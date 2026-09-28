package exercicios.lista08;

public class Conteudo {

    protected static int contador = 1;

    private int id;
    private String titulo;
    private int duracaoEmSegundos;

    public Conteudo(String titulo, int duracaoEmSegundos) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título inválido. O título não pode ser vazio.");
        }

        if (duracaoEmSegundos <= 0) {
            throw new IllegalArgumentException(
                    "Duração inválida: " + duracaoEmSegundos + ". A duração deve ser maior que zero.");
        }

        this.titulo = titulo;
        this.duracaoEmSegundos = duracaoEmSegundos;
        // So consome um id depois de validar: se o construtor lanca, nenhum id e gasto.
        this.id = contador;
        contador++;
    }

    public void reproduzir() {
        System.out.println(titulo + " está sendo reproduzido");
    }

    protected void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public String getDuracaoFormatada() {
        int minutos = getDuracaoEmSegundos() / 60;
        int segundos = getDuracaoEmSegundos() % 60;
        return String.format("%02d:%02d", minutos, segundos);
    }

    @Override
    public String toString() {
        // id, título e duração
        return "Id: " + id + " título: " + titulo + " duração: " + getDuracaoFormatada();
    }

}
