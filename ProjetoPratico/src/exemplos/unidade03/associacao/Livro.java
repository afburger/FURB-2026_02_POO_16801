package exemplos.unidade03.associacao;

import java.util.ArrayList;

public class Livro {

    private String titulo;
    private int anoPublicacao;
    private ArrayList<Pessoa> autores = new ArrayList<>();

    public Livro(Pessoa autor) {
        autores.add(autor);
        autor.addObra(this);
    }

    public Livro(ArrayList<Pessoa> autores) {
        this.autores.addAll(autores);
        for (Pessoa autor : autores) {
            autor.addObra(this);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public ArrayList<Pessoa> getAutores() {
        return autores;
    }

    public void addAutor(Pessoa autor) {
        autores.add(autor);
        autor.addObra(this);
    }


}
