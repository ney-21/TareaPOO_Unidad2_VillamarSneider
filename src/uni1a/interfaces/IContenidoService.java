package uni1a.interfaces;

import uni1a.Pelicula;

import java.util.List;

public interface IContenidoService {
    void mostrarTodos();
    List<Pelicula> buscarPeliculasPorActor(String nombre);
}
