package uni1a.archivos;

import org.junit.jupiter.api.Test;
import uni1a.Pelicula;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ArchivoPeliculaTest {

    private final String ruta = "peliculas_test.csv";

    @Test
    void testGuardarYLeer() {
        Pelicula peli = new Pelicula("Interstellar", 169, "Sci-Fi", "Paramount");
        ArchivoPelicula.guardar(List.of(peli), ruta);

        List<Pelicula> leidas = ArchivoPelicula.leer(ruta);
        assertEquals(1, leidas.size());
        assertEquals("Interstellar", leidas.get(0).getTitulo());

        // Eliminar archivo de prueba
        new File(ruta).delete();
    }
}
