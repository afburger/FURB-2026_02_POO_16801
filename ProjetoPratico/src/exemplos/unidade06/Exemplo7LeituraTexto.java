package exemplos.unidade06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exemplo7LeituraTexto {

    public static void main(String[] args) {
        File arquivo = new File("arq4.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(arquivo, "UTF-8");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
        sc.close();

    }

}
