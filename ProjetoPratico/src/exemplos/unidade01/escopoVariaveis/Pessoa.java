package exemplos.unidade01.escopoVariaveis;

public class Pessoa {

    double peso;
    double altura;
    String nome;
    double valorImc;

    double calcularImc() {
        return peso / (altura * altura);
    }

    void exibirInformacoes(String nome) {
        System.out.println("Nome: " + this.nome);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);

        double valorImc = calcularImc();
        if (this.valorImc <= 20) {
            System.out.println("Abaixo do peso");
        }
        if (this.valorImc >  20 && this.valorImc < 25) {
            System.out.println("Peso normal");
        }
        if (this.valorImc > 25) {
            System.out.println("Sobrepeso");
        }
        System.out.println("IMC Calculado: " + valorImc);
    }

}
