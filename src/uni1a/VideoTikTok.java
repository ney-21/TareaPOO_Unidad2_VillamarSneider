package uni1a;

public class VideoTikTok extends ContenidoAudiovisual {
    private String usuario;
    private boolean tieneMusica;

    public VideoTikTok(String titulo, int duracionEnMinutos, String genero, String usuario, boolean tieneMusica) {
        super(titulo, duracionEnMinutos, genero);
        this.usuario = usuario;
        this.tieneMusica = tieneMusica;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean isTieneMusica() {
        return tieneMusica;
    }

    public void setTieneMusica(boolean tieneMusica) {
        this.tieneMusica = tieneMusica;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del video de TikTok:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " segundos");
        System.out.println("Género: " + getGenero());
        System.out.println("Usuario: @" + usuario);
        System.out.println("Con música: " + (tieneMusica ? "Sí" : "No"));
        System.out.println();
    }
}
