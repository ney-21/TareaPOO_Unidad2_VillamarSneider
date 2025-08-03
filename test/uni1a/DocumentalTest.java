package uni1a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DocumentalTest {

    @Test
    void testSetInvestigador() {
        Documental d = new Documental("Cosmos", 45, "Ciencia", "Espacio");
        Investigador i = new Investigador("Carl Sagan", "Astronomía");
        d.setInvestigador(i);
        assertEquals("Carl Sagan", d.getInvestigador().getNombre());
    }

    @Test
    void testToCSV() {
        Documental d = new Documental("Cosmos", 45, "Ciencia", "Espacio");
        assertEquals("Cosmos,45,Ciencia,Espacio", d.toCSV());
    }
}
