package exercicios.lista03;

public class Playlist {

    private String nome;
    private Usuario dono;
    private Musica[] musicas;
    private int quantidadeMusicas;

    public Playlist(String nome, Usuario dono) {
        this.nome = nome;
        this.dono = dono;
        musicas = new Musica[100];
    }

    public String getNome() {
        return nome;
    }

    public Usuario getDono() {
        return dono;
    }

    public int getQuantidade() {
        return quantidadeMusicas;
    }

    public boolean adicionar(Musica musica) {
        if (musica == null || musicas.length == quantidadeMusicas) {
            return false;
        } else {
            musicas[quantidadeMusicas] = musica;
            quantidadeMusicas++;
            return true;
        }
    }

    public Musica getNaPosicao(int indice) {
        if (indice >= 0 && indice < musicas.length) {
            return musicas[indice];
        }
        return null;
    }

    public boolean removerNaPosicao(int indice) {
        if (indice >= 0 && indice <= quantidadeMusicas) {
            //  0  1  2  3  4
            // [A][X][Y][J][K]
            // [A][X][ ][J][K]
            // [A][X][J][K][ ]
            for (int i = indice; i < quantidadeMusicas; i++) {
                musicas[i] = musicas[i + 1];
            }
            musicas[quantidadeMusicas] = null;
            quantidadeMusicas--;
        }
        return false;
    }

    public int getDuracaoTotalSegundos() {
        int total = 0;
        for (int i = 0; i < quantidadeMusicas; i++) {
            Musica musicaPosicao = musicas[i];
            total = total + musicaPosicao.getDuracaoEmSegundos();
        }
        return total;
    }

    public void reproduzirTudo() {
        for (int i = 0; i < quantidadeMusicas; i++) {
            musicas[i].reproduzir();
        }
    }

     public String getDuracaoFormatada() {
        int totalEmSegundos = getDuracaoTotalSegundos();
        int minutos = totalEmSegundos / 60;
        int segundos = totalEmSegundos % 60;
        return String.format("%02d:%02d", minutos, segundos);
    }
}
