package exemplos.unidade04.heranca;

public class Barco extends Veiculo {

    private String registroMarinha;

    public Barco(String modelo, String registroMarinha, int anoFabricacao) {
        super(anoFabricacao, modelo);
        this.registroMarinha = registroMarinha;
    }

    public String getRegistroMarinha() {
        return registroMarinha;
    }

    @Override
    public void imprimeMovimento() {
       System.out.println("Movimentação de flutuação");
    }

    protected void setRegistroMarinha(String registro) {
        registroMarinha = registro;
    }

    @Override
    public String toString() {
        return super.toString() + " Registro: " + registroMarinha;
    }

}
