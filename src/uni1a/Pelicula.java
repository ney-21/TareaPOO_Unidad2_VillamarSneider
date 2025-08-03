package uni1a;

import uni1a.interfaces.Mostrable;
import uni1a.interfaces.GuardableCSV;

import java.util.ArrayList;
import java.util.List;

public class Pelicula extends ContenidoAudiovisual implements Mostrable, GuardableCSV {
    private String estudio;
    private List<Actor> actores = new ArrayList<>();

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    public List<Actor> getActores() {
        return actores;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("🎬 Película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        if (!actores.isEmpty()) {
            System.out.println("Actores:");
            for (Actor a : actores) {
                System.out.println("- " + a.getNombre());
            }
        }
        System.out.println();
    }

    @Override
    public String toCSV() {
        return getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + estudio;
    }
}

