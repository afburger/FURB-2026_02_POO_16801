package exercicios.lista09;

// Para pensar: depois das duas rodadas de generalizacao, PlanoIndividual nao tem nenhum
// membro proprio alem do construtor. A aula diz que uma classe vazia apos a generalizacao
// pode ser candidata a desaparecer (sua superclasse assumiria o papel). Porem, aqui ela e
// mantida por clareza de modelagem e para que o codigo cliente possa criar um PlanoIndividual
// de forma explicita, deixando claro o tipo de plano escolhido.
public class PlanoIndividual extends PlanoPago {

    public PlanoIndividual(double precoMensal) {
        super("Individual", 1, precoMensal);
    }

    @Override
    public double calcularMensalidade() {
        return getPrecoMensal();
    }

}
