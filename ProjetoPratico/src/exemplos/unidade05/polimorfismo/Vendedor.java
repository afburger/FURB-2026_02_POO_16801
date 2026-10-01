package exemplos.unidade05.polimorfismo;

public class Vendedor extends Funcionario {

    private double percentualComissao;
    private int quantidadeVendas;

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    @Override
    public double calcularSalario() {
        double salario = getSalarioBase();
        salario = salario + (percentualComissao * quantidadeVendas);
        return salario;
    }
    
    @Override
    public void imprimeFuncionario() {
        System.out.println(getNome() + " - " + quantidadeVendas);
    }

}
