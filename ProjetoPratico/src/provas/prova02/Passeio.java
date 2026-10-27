package provas.prova02;

public class Passeio extends ServiceTuristico implements Reembolsavel {

    private int pessoas;

    public Passeio(String descricao, double valorBase, int pessoas) {
        if (pessoas <= 0) {
            throw new IllegalArgumentException("Quantidade de pessoas inválida");
        }
        super(descricao, valorBase);
        this.pessoas = pessoas;
    }

    public int getPessoas() {
        return pessoas;
    }

    @Override
    public double calcularValor() {
        double valorTotal = getValorBase() * pessoas;
        if (pessoas >= 5) {
            valorTotal = valorTotal - (valorTotal * 0.10);
        }
        return valorTotal;
    }

    @Override
    public double calcularReembolso() {
        return calcularValor() * 0.70;
    }

}
