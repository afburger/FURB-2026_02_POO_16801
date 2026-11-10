package exemplos.unidade06;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exemplo3LeituraBinario {

    public static void main(String[] args) {
        File f = null;
        FileInputStream fis = null;
        try {
            f = new File("dados.dat");
            fis = new FileInputStream(f);
            int dado;

            while (true) {
                dado = fis.read();
                if (dado != -1) {
                    System.out.println(dado);
                } else {
                    break;
                }
            }
            fis.close();
            System.out.println("Terminou");
        } catch (IOException e) {
            System.out.println("Deu erro: " + e.getMessage());
        } 

    }
}
