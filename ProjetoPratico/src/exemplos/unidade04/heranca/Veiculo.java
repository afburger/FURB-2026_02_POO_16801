package exemplos.unidade04.heranca;

public class Veiculo {

    private int anoFabricacao;
    private String marca;
    private String modelo;

    public Veiculo(int anoFabricacao, String modelo) {
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void imprimeMovimento() {
        System.out.println("Movimentação padrão de veículos");
    }

    @Override
    public String toString() {
        return marca + " - " +modelo;
    }
    

}
