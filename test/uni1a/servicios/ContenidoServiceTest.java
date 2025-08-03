package uni1a.servicios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uni1a.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ContenidoServiceTest {

    private ContenidoService servicio;

    @BeforeEach
    void setUp() {
        List<ContenidoAudiovisual> contenidos = new ArrayList<>();
        Pelicula peli = new Pelicula("Origen", 148, "Sci-Fi", "WB");
        peli.agregarActor(new Actor("Leonardo DiCaprio", 48, "EE.UU."));
        contenidos.add(peli);
        servicio = new ContenidoService(contenidos);
    }

    @Test
    void testBuscarActorExistente() {
        List<Pelicula> resultado = servicio.buscarPeliculasPorActor("Leonardo DiCaprio");
        assertFalse(resultado.isEmpty());
    }

    @Test
    void testBuscarActorInexistente() {
        List<Pelicula> resultado = servicio.buscarPeliculasPorActor("Nadie");
        assertTrue(resultado.isEmpty());
    }
}
