package exemplos.unidade06;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Exemplo9Deserializacao {

    public static void main(String[] args) {
        File f = new File("Objetos.bin");
        String objeto1 = null;
        ContaBancaria objeto2 = null;
        Veiculo objeto3 = null;

        try (FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            objeto1 = (String) ois.readObject();
            objeto2 = (ContaBancaria) ois.readObject();
            objeto3 = (Veiculo) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println(objeto1);
        System.out.println(objeto2);
        System.out.println(objeto3);

    }

}
