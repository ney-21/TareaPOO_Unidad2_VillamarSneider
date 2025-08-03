package uni1a.servicios;

import uni1a.ContenidoAudiovisual;
import uni1a.Pelicula;
import uni1a.Actor;
import uni1a.interfaces.IContenidoService;

import java.util.ArrayList;
import java.util.List;

public class ContenidoService implements IContenidoService {
    private List<ContenidoAudiovisual> contenidos;

    public ContenidoService(List<ContenidoAudiovisual> contenidos) {
        this.contenidos = contenidos;
    }

    @Override
    public void mostrarTodos() {
        for (ContenidoAudiovisual c : contenidos) {
            c.mostrarDetalles();
        }
    }

    @Override
    public List<Pelicula> buscarPeliculasPorActor(String nombre) {
        List<Pelicula> resultado = new ArrayList<>();
        for (ContenidoAudiovisual c : contenidos) {
            if (c instanceof Pelicula p) {
                for (Actor a : p.getActores()) {
                    if (a.getNombre().equalsIgnoreCase(nombre)) {
                        resultado.add(p);
                    }
                }
            }
        }
        return resultado;
    }
}
