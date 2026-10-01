package exemplos.unidade05.polimorfismo;

public class Gerente extends Funcionario {

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (getSalarioBase() * 0.10);
    }

    @Override
    public void imprimeFuncionario() {
        System.out.println(getNome() + " - " + calcularSalario());
    }
}
