package uni1a;

import uni1a.interfaces.Mostrable;
import uni1a.interfaces.GuardableCSV;

import java.util.ArrayList;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual implements Mostrable, GuardableCSV {
    private int temporadas;
    private List<Temporada> listaTemporadas = new ArrayList<>();

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void agregarTemporada(Temporada temporada) {
        listaTemporadas.add(temporada);
    }

    public List<Temporada> getListaTemporadas() {
        return listaTemporadas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("📺 Serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + temporadas);
        if (!listaTemporadas.isEmpty()) {
            System.out.println("Lista de Temporadas:");
            for (Temporada t : listaTemporadas) {
                System.out.println("- Temporada " + t.getNumeroTemporada() + ": " + t.getCantidadEpisodios() + " episodios");
            }
        }
        System.out.println();
    }

    @Override
    public String toCSV() {
        return getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + temporadas;
    }
}
