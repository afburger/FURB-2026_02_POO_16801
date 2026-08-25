package exemplos.unidade01.tratamentoExcecoes;

public class Estacionamento2 {

    public static void main(String[] args) {
        
        try {  
            Carro[] carros = new Carro[10];
    
            carros[0] = new Carro("LXX-2514", "Gol", 19, 25);
            carros[1] = new Carro("RLB-2X15", null, 19, 30);
        
    
            System.out.println("Carro 1 estacionado: " + carros[1].getModelo() + " - " + carros[1].getPlaca());
        } catch (NullPointerException e) {
            System.out.println("Carro 1 não estacionado");
        } catch (Exception e) {
            System.out.println("Erro inesperado");
        }



    }

}
