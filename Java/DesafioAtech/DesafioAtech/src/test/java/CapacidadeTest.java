import org.example.Main;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class CapacidadeTest {

    @Test
    public void exemplo1_enunciado() {
        int N = 3;
        int[] E = {1, 5, 7};
        int[] S = {9, 13, 12};
        assertEquals(3, Main.Capacidade.maxCapacidadeSim(N, E, S));
    }

    @Test
    public void exemplo2_enunciado() {
        int N = 4;
        int[] E = {1, 4, 8, 10};
        int[] S = {3, 8, 10, 17};
        assertEquals(1, Main.Capacidade.maxCapacidadeSim(N, E, S));
    }

    @Test
    public void todosSobrepostos_picoN() {
        int N = 5;
        int[] E = {1, 1, 1, 1, 1};
        int[] S = {10, 10, 10, 10, 10};
        assertEquals(5, Main.Capacidade.maxCapacidadeSim(N, E, S));
    }

    @Test
    public void todosDisjuntos_pico1() {
        int N = 4;
        int[] E = {1, 3, 5, 7};
        int[] S = {2, 4, 6, 8};
        assertEquals(1, Main.Capacidade.maxCapacidadeSim(N, E, S));
    }

    @Test
   public  void muitosEmpates_regraSaidaPrimeiro() {
        int N = 4;
        int[] E = {1, 2, 2, 3};
        int[] S = {2, 2, 3, 4};
        assertEquals(1, Main.Capacidade.maxCapacidadeSim(N, E, S));
    }
}
