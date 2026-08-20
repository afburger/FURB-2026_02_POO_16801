package exercicios.lista02.questao02;

public class App {

    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("iPhone");
        produto.setPreco(5500.00);
        
        produto.vender(1);

        produto.repor(10);

        produto.vender(4);

        produto.setPreco(-7800.00);

        produto.vender(3);

        System.out.println("O estoque atualizado: " + produto.getEstoque());

    }

}
