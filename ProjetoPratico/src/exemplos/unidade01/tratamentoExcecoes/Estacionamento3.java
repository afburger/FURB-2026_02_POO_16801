package exemplos.unidade01.tratamentoExcecoes;

import java.util.Scanner;

public class Estacionamento3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        try {

            System.out.println("Informe a placa do carro:");
            String placa = scan.nextLine();

            System.out.println("Informe o modelo do carro:");
            String modelo = scan.nextLine();

            System.out.println("Informe a hora de estacionamento:");
            int hora = Integer.parseInt(scan.nextLine());

            System.out.println("Informe o minuto de estacionamento:");
            int minuto = Integer.parseInt(scan.nextLine());

        } catch (NullPointerException e) {
            System.out.println("Alguma variável está vazia");
        } catch (NumberFormatException ex) {
            System.out.println("Infome o número corretamente");
        } finally {
            scan.close();
        }

        




    }

}
