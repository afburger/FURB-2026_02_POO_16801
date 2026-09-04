package exemplos.unidade03.associacao;

import java.util.ArrayList;

public class Pessoa {

    private String nome;
    private String email;
    private ArrayList<Livro> obras = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Livro> getObras() {
        return obras;
    }
    
    public void addObra(Livro obra) {
        obras.add(obra);
    }
}
