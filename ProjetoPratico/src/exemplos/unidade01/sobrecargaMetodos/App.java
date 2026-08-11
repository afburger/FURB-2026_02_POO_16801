package exemplos.unidade01.sobrecargaMetodos;

public class App {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.somar(1, 2);
        calc.somar(1.5, 2.5);
        calc.somar(1, 2, 3);

        Impressora imp = new Impressora();
        imp.imprimir("Teste");
        imp.imprimir("Nota", 3);
    }

}
