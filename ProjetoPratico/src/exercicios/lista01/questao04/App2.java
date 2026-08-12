package exercicios.lista01.questao04;

import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[3];

        for (int i = 0; i < pessoas.length; i++) {
            int numeroPessoa = i + 1;
            Pessoa pessoa = new Pessoa();
            System.out.println("Digite o nome da pessoa " + numeroPessoa);
            pessoa.nome = scan.next();

            System.out.println("Digite a altura da pessoa " + numeroPessoa);
            // Faz a leitura da informação digitada pelo usuário e atribui ao objeto
            pessoa.altura = scan.nextDouble();

            System.out.println("Digite o peso da pessoa " + numeroPessoa);
            pessoa.peso = scan.nextDouble();

            // Adiciona a pessoa com as informações lidas no vetor.
            pessoas[i] = pessoa;
        }

        for (int i = pessoas.length - 1; i >= 0; i--) {
            pessoas[i].exibirInformacoes();
            System.out.println("--------------");
        }
        
    }

}
