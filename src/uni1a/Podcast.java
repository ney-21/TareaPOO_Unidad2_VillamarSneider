package uni1a;

import uni1a.interfaces.Mostrable;
import uni1a.interfaces.GuardableCSV;

public class Podcast extends ContenidoAudiovisual implements Mostrable, GuardableCSV {
    private String conductor;
    private String plataforma;

    public Podcast(String titulo, int duracionEnMinutos, String genero, String conductor, String plataforma) {
        super(titulo, duracionEnMinutos, genero);
        this.conductor = conductor;
        this.plataforma = plataforma;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("🎧 Podcast:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        System.out.println("Conductor: " + conductor);
        System.out.println("Plataforma: " + plataforma);
        System.out.println();
    }

    @Override
    public String toCSV() {
        return getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + conductor + "," + plataforma;
    }
}

