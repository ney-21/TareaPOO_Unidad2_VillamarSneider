package uni1a;

import uni1a.interfaces.Mostrable;
import uni1a.interfaces.GuardableCSV;

public class VideoTikTok extends ContenidoAudiovisual implements Mostrable, GuardableCSV {
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
        System.out.println("📱 Video TikTok:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " seg");
        System.out.println("Género: " + getGenero());
        System.out.println("Usuario: @" + usuario);
        System.out.println("Con música: " + (tieneMusica ? "Sí" : "No"));
        System.out.println();
    }

    @Override
    public String toCSV() {
        return getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + usuario + "," + tieneMusica;
    }
}
