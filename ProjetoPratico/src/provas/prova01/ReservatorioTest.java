package provas.prova01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ReservatorioTest {

    // ===== EXEMPLO FORNECIDO PELO PROFESSOR =====
    @Test
    void deveEncherComVolumeValido() {
        Reservatorio r = new Reservatorio(1, "Caixa d'água", 1000.0);
        r.encher(300.0);
        assertEquals(300.0, r.getNivelAtual(), 0.001);
    }

    @Test 
    void deveEncherComValorNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            Reservatorio r = new Reservatorio(1, "Nome do reservatório", 1000);
            r.encher(-1);
        });
    }

    @Test 
    void deveEncherUltrapassandoCapacidade() {
        assertThrows(IllegalStateException.class, () -> {
            Reservatorio r = new Reservatorio(1, "Nome do reservatório", 1000);
            r.encher(5000);
        });
    }

    
}
