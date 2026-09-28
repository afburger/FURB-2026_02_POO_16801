package exercicios.lista08;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Musica musica1 = new Musica("Titulo música 1", "Artista mus 1", "Album 1", 284);
        Musica musica2 = new Musica("Titulo música 2", "Artista mus 2", "Album 1", 385);
        Podcast pod = new Podcast("Apresentador", 1, 900, "Título podcast");

        musica1.reproduzir();
        musica2.reproduzir();
        pod.reproduzir();

        System.out.println(musica1);
        System.out.println(musica2);
        System.out.println(pod);
    }
}
