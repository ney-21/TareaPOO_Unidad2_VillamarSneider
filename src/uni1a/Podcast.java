package uni1a;

public class Podcast extends ContenidoAudiovisual {
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
        System.out.println("Detalles del podcast:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Conductor: " + conductor);
        System.out.println("Plataforma: " + plataforma);
        System.out.println();
    }
}
