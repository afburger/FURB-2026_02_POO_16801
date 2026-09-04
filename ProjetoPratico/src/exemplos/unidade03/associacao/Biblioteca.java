package exemplos.unidade03.associacao;

import java.util.ArrayList;


public class Biblioteca {

    public static void main(String[] args) {
        Pessoa autor1 = new Pessoa();
        autor1.setNome("Nome Autor 1");
        autor1.setEmail("autor1@furb.br");

        Pessoa autor2 = new Pessoa();
        autor2.setNome("Nome Autor 2");
        autor2.setEmail("autor2@furb.br");

        Livro livro1 = new Livro(autor1);
        livro1.setTitulo("Titulo Livro 1");
        livro1.setAnoPublicacao(2025);
        livro1.addAutor(autor2);

        Livro livro2 = new Livro(autor2);
        livro2.setTitulo("Titulo Livro 2");
        livro2.setAnoPublicacao(2020);

        ArrayList<Pessoa> autoresLivro3 = new ArrayList<>();
        autoresLivro3.add(autor1);
        autoresLivro3.add(autor2);

        Livro livro3 = new Livro(autoresLivro3);
        livro3.setTitulo("Titulo Livro 3");
        livro3.setAnoPublicacao(1980);

        ArrayList<Livro> acervo = new ArrayList<>();
        acervo.add(livro1);
        acervo.add(livro2);
        acervo.add(livro3);

        for (Livro livro : acervo) {
            System.out.println(livro.getTitulo());
            System.out.println("Autores: ");
            for (Pessoa autor : livro.getAutores()) {
                System.out.println(autor.getNome());
            }
            System.out.println("----------------------");
        }

        System.out.println("Livros do Autor 1");
        for (Livro livro : autor1.getObras()) {
            System.out.println(livro.getTitulo());
        }
    }

}
