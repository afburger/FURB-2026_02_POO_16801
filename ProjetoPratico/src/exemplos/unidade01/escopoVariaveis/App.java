package exemplos.unidade01.escopoVariaveis;

public class App {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "André";
        p.altura = 1.50;
        p.peso = 45;
        p.valorImc = 50;

        p.exibirInformacoes("Felipe");
    }

}
