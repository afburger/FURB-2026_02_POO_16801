package exemplos.unidade05.interfaces;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<EmitirSom> emissores = new ArrayList<>();

        emissores.add(new Cachorro());
        emissores.add(new Violao());
        emissores.add(new Gato());

        for (EmitirSom emissor : emissores) {
            System.out.println(emissor.emitirSom());
        }
    }

}
