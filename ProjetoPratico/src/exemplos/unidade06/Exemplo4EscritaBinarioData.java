package exemplos.unidade06;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exemplo4EscritaBinarioData {

    public static void main(String[] args) {
        try {
            File f = new File("dados.bin");
            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);
            double preco = 5.0;
            dos.writeDouble(preco);
            dos.writeBoolean(true);
            dos.writeUTF("FURB");
            dos.close();
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
