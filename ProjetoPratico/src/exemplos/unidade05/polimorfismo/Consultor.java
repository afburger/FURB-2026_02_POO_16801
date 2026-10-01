package exemplos.unidade05.polimorfismo;

public class Consultor extends Funcionario {

    private int quantidadeViagens;

    public int getQuantidadeViagens() {
        return quantidadeViagens;
    }

    public void setQuantidadeViagens(int quantidadeViagens) {
        this.quantidadeViagens = quantidadeViagens;
    }

    @Override
    public double calcularSalario() {
        double salario = super.calcularSalario();
        salario = salario + (quantidadeViagens * 500);
        return salario;
    }

    @Override
    public void imprimeFuncionario() {
        System.out.println(getNome() + " - " + quantidadeViagens);
    }

}
