package exemplos.unidade01.sobrecargaMetodos;

public class Calculadora {

    public void somar(int valor1, int valor2) {
        int soma = valor1 + valor2;
        System.out.println("O Resultado da soma é: " + soma);
    }

    // Sobrecarga com tipos  de retorno diferente não é possível.
    //public int somar(int valor1, int valor2) {
    //    return valor1 + valor2;
    //}

    public void somar(double valor1, double valor2) {
        double soma = valor1 + valor2;
        System.out.println("O Resultado da soma é: " + soma);
    }

    public void somar(int valor1, int valor2, int valor3) {
        int soma = valor1 + valor2 + valor3;
        System.out.println("O Resultado da soma é: " + soma);
    }

}
