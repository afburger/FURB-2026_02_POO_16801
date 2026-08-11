package exemplos.unidade01.sobrecargaMetodos;

public class Impressora {


    public void imprimir(String texto) {
        System.out.println(texto);
    }

    public void imprimir(String texto, int qtdVezes) {
       for (int i = 0; i < qtdVezes; i++) {
           System.out.println(texto);
       }
    }

}
