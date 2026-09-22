package exemplos.unidade04.heranca;

public class Jetsky extends Barco {

    public Jetsky(String modelo, String registroMarinha, int anoFabricacao) {
        super(modelo, registroMarinha, anoFabricacao);
    }

    public void alteraRegistroMarinha(String registro) {
        setRegistroMarinha(registro);
    }

}
