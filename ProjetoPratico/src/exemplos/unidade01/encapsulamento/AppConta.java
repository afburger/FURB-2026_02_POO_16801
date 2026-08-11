package exemplos.unidade01.encapsulamento;

public class AppConta {

    public static void main(String[] args) {
        ContaBancaria cc = new ContaBancaria();

        cc.setNumero(1234);
        cc.setTitular("André");
        //cc.setAtiva(true);
        cc.depositar(1000);
        cc.sacar(50);

        System.out.println("Saldo atual da conta do "+ cc.getTitular() +" número: " + cc.getNumero() + " é: " + cc.getSaldo());

        System.out.println("Saldo da conta do "+ cc.getTitular() + " agora é: " + cc.getSaldo());

        String situacao = cc.isAtiva() ? "Ativa" : "Inativa";
        System.out.println("Situação da conta: " + situacao);
    }

}
