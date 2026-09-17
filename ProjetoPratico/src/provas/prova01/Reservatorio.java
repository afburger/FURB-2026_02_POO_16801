package provas.prova01;

public class Reservatorio {

    private static int totalReservatorios = 0;

    private int identificador;
    private String descricao;
    private double capacidade;
    private double nivelAtual;

    public Reservatorio(int identificador, String descricao, double capacidade) {
        this(identificador, descricao, capacidade, 0.0);
    }

    public Reservatorio(int identificador, String descricao, 
        double capacidade, double nivelInicial) {
            if (capacidade <= 0) {
                throw new IllegalArgumentException("Capacidade inválida");
            }
            if (nivelInicial < 0 || nivelInicial > capacidade) {
                throw new IllegalArgumentException("Nível inicial inválido");
            }

            this.identificador = identificador;
            this.descricao = descricao;
            this.capacidade = capacidade;
            this.nivelAtual = nivelInicial;
            totalReservatorios++;
    }

    public void encher(double litros) {
        if (litros <= 0) {
            throw new IllegalArgumentException("Volume inválido");
        }

        if (nivelAtual + litros > capacidade) {
            throw new IllegalStateException("Capacidade excedida");
        }
        nivelAtual = nivelAtual + litros;
    }

    public void esvaziar(double litros) {
        if (litros <= 0) {
            throw new IllegalArgumentException("Volume inválido");
        }
        if (litros > nivelAtual) {
            throw new IllegalStateException("Volume insuficiente");
        }
        nivelAtual = nivelAtual - litros;
    }

    public double getNivelAtual() {
        return nivelAtual;
    }

    public int getIdentificador() {
        return identificador;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static int getTotalReservatorios() {
        return totalReservatorios;
    }

}
