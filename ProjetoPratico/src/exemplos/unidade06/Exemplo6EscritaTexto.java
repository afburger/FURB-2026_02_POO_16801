package exemplos.unidade06;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Exemplo6EscritaTexto {

    public static void main(String[] args) {
    String linha = "áéíóúç!";
    PrintWriter out = null;
    try {
        out = new PrintWriter("arq4.txt", "UTF-8");
    } catch (FileNotFoundException | UnsupportedEncodingException e) {
        System.out.println("Erro: " + e.getMessage());
    }
    out.println(linha);
    out.println("Segunda linha");
    out.print(true);
    out.printf("Preço: %20.2f", 1234.5);

    out.close();


    }
}
