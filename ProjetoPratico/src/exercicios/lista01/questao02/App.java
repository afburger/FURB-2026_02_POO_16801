package exercicios.lista01.questao02;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Declara a variável de instância e já instância o objeto;
        Pessoa usuario = new Pessoa();
       
        System.out.println("Digite a sua altura:");
        // Faz a leitura da informação digitada pelo usuário e atribui ao objeto
        usuario.altura = scan.nextDouble();

        System.out.println("Digite o seu peso: ");
        usuario.peso = scan.nextDouble();

        System.out.println("O seu IMC é de: " + usuario.calcularImc());
    }

}
