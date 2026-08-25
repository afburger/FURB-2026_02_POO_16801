package exemplos.unidade01.excecoes;

public class Carro {

    private String placa;
    private String modelo;
    private int hora;
    private int minuto;

    public Carro(String placa, String modelo, int hora, int minuto) {
        this.placa = placa;
        if (modelo == null) {
            throw new IllegalArgumentException("O modelo não pode ser vazio");
        }
        this.modelo = modelo;
        this.hora = hora;
        this.minuto = minuto;
    }

    public String getPlaca() {
        return placa;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public int getHora() {
        return hora;
    }
    
    public int getMinuto() {
        return minuto;
    }

}
