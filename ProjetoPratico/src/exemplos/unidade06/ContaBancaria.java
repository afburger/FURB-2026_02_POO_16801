package exemplos.unidade06;

import java.io.Serializable;

public class ContaBancaria implements Serializable {

    private static final long serialVersionUID = 1L;

    private String codigo;
    private String nome;
    private int saldo;

    public ContaBancaria(String codigo, String nome, int saldo) {
        this.codigo = codigo;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getSaldo() {
        return saldo;
    }


    @Override
    public String toString() {
        return codigo + " - " + nome + " - " + saldo;
    }

}
