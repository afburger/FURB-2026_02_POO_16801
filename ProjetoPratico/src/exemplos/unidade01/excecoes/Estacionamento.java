package exemplos.unidade01.excecoes;

public class Estacionamento {

    public static void main(String[] args) {
        Carro[] carros = new Carro[10];

        carros[0] = new Carro("LXX-2514", "Gol", 19, 25);
        carros[1] = new Carro("RLB-2X15", null, 19, 30);

        System.out.println("Carro 1 estacionado: " + carros[1].getModelo() + " - " + carros[1].getPlaca());
    }

}
