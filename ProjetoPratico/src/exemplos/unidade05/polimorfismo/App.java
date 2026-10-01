package exemplos.unidade05.polimorfismo;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Funcionario f = new Programador();
        f.setNome("Funcionario Programador");
        f.setSalarioBase(5700);

        Programador p = new Programador();
        p.setNome("Programador");
        p.setSalarioBase(9500);
        p.adicionarLinguagem("Java");

        Gerente g = new Gerente();
        g.setNome("Gerente");
        g.setSalarioBase(12000);

        Consultor c = new Consultor();
        c.setNome("Consultor");
        c.setQuantidadeViagens(5);
        c.setSalarioBase(5000);

        ArquitetoSoftware as = new ArquitetoSoftware();
        as.setNome("Arquiteto");
        as.adicionarLinguagem("Java");
        as.adicionarLinguagem("C#");
        as.adicionarLinguagem("Phyton");
        as.setSalarioBase(9500);

        Vendedor v = new Vendedor();
        v.setNome("Vendedor");
        v.setPercentualComissao(10);
        v.setQuantidadeVendas(5);
        v.setSalarioBase(4000);

        funcionarios.add(f);
        funcionarios.add(p);
        funcionarios.add(g);
        funcionarios.add(c);
        funcionarios.add(as);
        funcionarios.add(v);

        for (Funcionario func : funcionarios) {
            func.imprimeFuncionario();
            System.out.println(func.calcularSalario());

            if (func instanceof Consultor) {
                System.out.println(((Consultor) func).getQuantidadeViagens());
            }
        }

    }

}
