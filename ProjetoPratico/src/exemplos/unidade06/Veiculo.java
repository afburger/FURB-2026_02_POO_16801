package exemplos.unidade06;

import java.io.Serializable;

public class Veiculo implements Serializable{

    private static final long serialVersionUID = 1L;

    private String placa;
    private String proprietario;

    public Veiculo(String placa, String proprietario) {
        this.placa = placa;
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public String getProprietario() {
        return proprietario;
    }

     @Override
    public String toString() {
        return placa + " - " + proprietario;
    }
}
