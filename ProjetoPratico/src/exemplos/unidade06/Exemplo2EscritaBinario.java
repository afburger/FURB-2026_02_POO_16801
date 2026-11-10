package exemplos.unidade06;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exemplo2EscritaBinario {

    public static void main(String[] args) {
        try {
            File arquivo = new File("dados.dat");
            FileOutputStream fos = new FileOutputStream(arquivo, true);
            fos.write(65);
            fos.write(6);
            fos.close();
        } catch (IOException e) {
            System.out.println("Problema ao acessar o arquivo");
        }

    }

}
