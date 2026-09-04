package exemplos.unidade03.associacao;

public class Funcionario {

    private String nome;
    private Funcionario empregado;
    private Funcionario gerente;
    
    public String getNome() {
        return nome;
    }
    public Funcionario getEmpregado() {
        return empregado;
    }
    public Funcionario getGerente() {
        return gerente;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmpregado(Funcionario empregado) {
        this.empregado = empregado;
    }
    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }
    

    

}
