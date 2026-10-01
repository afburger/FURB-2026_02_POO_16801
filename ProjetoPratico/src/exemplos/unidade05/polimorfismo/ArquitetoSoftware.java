package exemplos.unidade05.polimorfismo;

public class ArquitetoSoftware extends Programador {

    @Override
    public double calcularSalario() {
        double salario = super.calcularSalario();
        double comissao = getSalarioBase() * (getLinguagens().size() * 2);
        return  salario + comissao;
    }

}
