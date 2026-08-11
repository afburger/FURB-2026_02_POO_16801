package exemplos.unidade01.construtores;

public class App {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Branco", "BMW 320", 2026, 123456);

        Carro carro = new Carro();
        carro.setAno(1976);
        carro.setModelo("Fusca0");
        carro.setCor("Azul");
        carro.setRenavam(9876);


        if (carro.isDocumentoEmDia()) {
            System.out.println(carro.getRenavam());
        }
    }

}
