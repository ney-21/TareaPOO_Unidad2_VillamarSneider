package uni1a;

import uni1a.interfaces.Mostrable;
import uni1a.interfaces.GuardableCSV;

public class Documental extends ContenidoAudiovisual implements Mostrable, GuardableCSV {
    private String tema;
    private Investigador investigador;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Investigador getInvestigador() {
        return investigador;
    }

    public void setInvestigador(Investigador investigador) {
        this.investigador = investigador;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("📚 Documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + tema);
        if (investigador != null) {
            System.out.println("Investigador: " + investigador.getNombre() + " (" + investigador.getCampoInvestigacion() + ")");
        }
        System.out.println();
    }

    @Override
    public String toCSV() {
        return getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + tema;
    }
}

