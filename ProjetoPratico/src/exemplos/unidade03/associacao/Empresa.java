package exemplos.unidade03.associacao;

public class Empresa {

    public static void main(String[] args) {
        Funcionario dono = new Funcionario();
        dono.setNome("João");

        Funcionario gerente = new Funcionario();
        gerente.setNome("André");

        Funcionario gerente2 = new Funcionario();
        gerente2.setNome("Felipe");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Antonio");

        Funcionario funcionario2 = new Funcionario();
        funcionario.setNome("Joaquim");

        gerente.setGerente(dono);
        gerente.setEmpregado(funcionario);

        gerente2.setEmpregado(funcionario2);


    }

}
