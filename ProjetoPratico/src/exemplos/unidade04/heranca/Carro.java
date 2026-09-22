package exemplos.unidade04.heranca;

public class Carro extends Veiculo {

    public Carro(int anoFabricacao, String modelo) {
        super(anoFabricacao, modelo);
    }

    @Override
    public void imprimeMovimento() {
        System.out.println("Movimentação de rodagem");
    }

}
