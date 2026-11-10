package exemplos.unidade06;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exemplo5LeituraBinarioData {

    public static void main(String[] args) {
        File f = new File("dados.bin");
        
        try (FileInputStream fis = new FileInputStream(f)){
            DataInputStream dis = new DataInputStream(fis);
            double preco = dis.readDouble();
            boolean bool = dis.readBoolean();
            String instituicao = dis.readUTF();

            System.out.println(preco);
            System.out.println(bool);
            System.out.println(instituicao);

            dis.close();

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } 

    }
}
