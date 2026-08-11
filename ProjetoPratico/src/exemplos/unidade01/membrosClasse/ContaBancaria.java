package exemplos.unidade01.membrosClasse;

public class ContaBancaria {

    private String titular;
    private int numero;
    private double saldo;
    private boolean ativa;

    // Variável estática (membro variável de classe)
    private static int id;

    public ContaBancaria() {
        this.id++;
    }

    // Método estático (membro método de classe)
    public static int getId() {
        return id;
    }

    void sacar(double valor) {
        saldo = saldo - valor;
    }

    void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    
    
}
