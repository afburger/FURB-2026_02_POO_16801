package exercicios.lista01.questao04;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        // Declara a variável de instância e já instância o objeto;
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
       
        // -------------- Pessoa 1 ------------------
        System.out.println("Digite a altura da pessoa 1:");
        // Faz a leitura da informação digitada pelo usuário e atribui ao objeto
        pessoa1.altura = scan.nextDouble();

        System.out.println("Digite o peso da pessoa 1: ");
        pessoa1.peso = scan.nextDouble();

        // -------------- Pessoa 2 ------------------
        System.out.println("Digite a altura da pessoa 2:");
        // Faz a leitura da informação digitada pelo usuário e atribui ao objeto
        pessoa2.altura = scan.nextDouble();

        System.out.println("Digite o peso da pessoa 2: ");
        pessoa2.peso = scan.nextDouble();

        // -------------- Pessoa 3 ------------------
        System.out.println("Digite a altura da pessoa 3:");
        // Faz a leitura da informação digitada pelo usuário e atribui ao objeto
        pessoa3.altura = scan.nextDouble();

        System.out.println("Digite o peso da pessoa 3: ");
        pessoa3.peso = scan.nextDouble();
        
        pessoa3.exibirInformacoes();
        System.out.println("----------------");
        pessoa2.exibirInformacoes();
        System.out.println("----------------");
        pessoa1.exibirInformacoes();
    }

}
