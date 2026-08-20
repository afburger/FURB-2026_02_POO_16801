package exercicios.lista02.questao03;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();

        System.out.println("Informe o número da primeira conta bancária");
        c1.setNumero(scan.nextLine());
        System.out.println("Informe o títular da primeira conta bancária");
        c1.setTitular(scan.nextLine());

        System.out.println("Informe o número da segunda conta bancária");
        c2.setNumero(scan.nextLine());
        System.out.println("Informe o títular da segunda conta bancária");
        c2.setTitular(scan.nextLine());

        c1.depositar(1000);
        c1.depositar(700);

        c2.depositar(5000);

        c2.sacar(3000);

        c2.transferir(c1, 1800);

        System.out.println("Titular da conta 1: " + c1.getTitular() + " saldo: " + c1.getSaldo());
        System.out.println("Titular da conta 2: " + c2.getTitular() + " saldo: " + c2.getSaldo());
    }

}
