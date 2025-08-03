package uni1a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SerieDeTVTest {

    @Test
    void testAgregarTemporada() {
        SerieDeTV serie = new SerieDeTV("GOT", 60, "Fantasía", 8);
        serie.agregarTemporada(new Temporada(1, 10));
        assertEquals(1, serie.getListaTemporadas().size());
        assertEquals(10, serie.getListaTemporadas().get(0).getCantidadEpisodios());
    }

    @Test
    void testToCSV() {
        SerieDeTV serie = new SerieDeTV("GOT", 60, "Fantasía", 8);
        assertEquals("GOT,60,Fantasía,8", serie.toCSV());
    }
}
