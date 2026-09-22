package exemplos.unidade04.heranca;

public class App {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo(2026, "Civic");

        Carro carro = new Carro(1976, "Fusca");

        veiculo.imprimeMovimento();
        System.out.println(veiculo.toString());

        carro.imprimeMovimento();
        System.out.println(carro.toString());

        Barco b = new Barco("70 pés", "RM255", 2025);
        b.imprimeMovimento();
        System.out.println(b.toString());

        Jetsky jet = new Jetsky("SEADOO 7777", "JT999", 2026);
        jet.imprimeMovimento();

        System.out.println(jet.toString());

    }

}
