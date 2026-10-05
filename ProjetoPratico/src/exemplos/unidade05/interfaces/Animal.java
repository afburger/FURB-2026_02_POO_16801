package exemplos.unidade05.interfaces;

public interface Animal extends EmitirSom {

    default String emitirSom() {
        return "Som de animal";
    }

}
