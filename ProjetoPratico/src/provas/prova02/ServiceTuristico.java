package provas.prova02;

public abstract class ServiceTuristico {

    private static int totalServicos = 0;
    private int codigo;
    private String descricao;
    private double valorBase;

    public ServiceTuristico(String descricao, double valorBase) {
        if (valorBase <= 0.00) {
            throw new IllegalArgumentException("Valor base inválido");
        }
        this.descricao = descricao;
        this.valorBase = valorBase;
        totalServicos++;
        codigo = totalServicos;
    }

    public static int getTotalServicos() {
        return totalServicos;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorBase() {
        return valorBase;
    }

    public abstract double calcularValor();

    @Override
    public String toString() {
        return codigo + " - " + descricao + " - R$ " + calcularValor();
    }
}
