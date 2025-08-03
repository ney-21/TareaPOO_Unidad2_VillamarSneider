package uni1a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PeliculaTest {

    @Test
    void testAgregarActor() {
        Pelicula p = new Pelicula("Inception", 130, "Sci-Fi", "Warner");
        Actor a = new Actor("Leonardo DiCaprio", 48, "EE.UU.");
        p.agregarActor(a);
        assertEquals(1, p.getActores().size());
        assertEquals("Leonardo DiCaprio", p.getActores().get(0).getNombre());
    }

    @Test
    void testToCSV() {
        Pelicula p = new Pelicula("Inception", 130, "Sci-Fi", "Warner");
        assertEquals("Inception,130,Sci-Fi,Warner", p.toCSV());
    }
}
