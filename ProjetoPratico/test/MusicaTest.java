import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import exercicios.lista04.Musica;

public class MusicaTest {

    private static Musica musica;

    @BeforeAll
    public static void criaMusica() {
        musica = new Musica("Teste", "André", 120);
    }

    @Test
    @DisplayName("Título")
    public void testTitulo() {
        assertEquals("Teste", musica.getTitulo());
    }

    @Test
    public void testArtista() {
        assertEquals("André", musica.getArtista());
    }

    @Test
    public void testTempoExcecao() {
        assertThrows(IllegalArgumentException.class, () ->{
            new Musica("Teste", "Andre", -10);
        });
    }

}
