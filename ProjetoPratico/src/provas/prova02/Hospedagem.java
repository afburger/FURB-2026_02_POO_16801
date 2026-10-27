package provas.prova02;

public class Hospedagem extends ServiceTuristico {

    private int diarias;

    public Hospedagem(String descricao, double valorBase, int diarias) {
        if (diarias <= 0) {
            throw new IllegalArgumentException("Quantidade de diárias inválida");
        }
        super(descricao, valorBase);
        this.diarias = diarias;
    }

    public int getDiarias() {
        return diarias;
    }

    @Override
    public double calcularValor() {
       return getValorBase() * diarias;
    }


}
