package exercicios.lista02.questao02;

public class Produto {

    private String nome;
    private double preco;
    private int estoque;

    public void vender(int quantidade) {
        if (quantidade < estoque) {
            estoque = estoque - quantidade;
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }

    public void repor(int quantidade) {
        if (quantidade > 0) {
            estoque = estoque + quantidade;
        } else {
            System.out.println("Quantidade inválida.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido");
        }
    }

    public int getEstoque() {
        return estoque;
    }
    

}
