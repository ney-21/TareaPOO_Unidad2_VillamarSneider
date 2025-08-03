package poo;

import uni1a.*;
import uni1a.controlador.ContenidoController;
import uni1a.interfaces.IContenidoService;
import uni1a.servicios.ContenidoService;
import uni1a.vista.MenuConsola;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // ================================
        // Bienvenida
        // ================================
        System.out.println("==============================================");
        System.out.println("🎬 Bienvenido al Sistema de Gestión de Contenidos Audiovisuales");
        System.out.println("==============================================\n");

        // ================================
        // Crear datos de ejemplo (modelo)
        // ================================
        List<ContenidoAudiovisual> contenidos = new ArrayList<>();

        contenidos.add(new Pelicula("Avatar", 125, "Acción", "20th Century Studios"));
        contenidos.add(new SerieDeTV("Game of Thrones", 60, "Fantasía", 8));
        contenidos.add(new Documental("Cosmos", 45, "Ciencia", "Astronomía"));
        contenidos.add(new VideoTikTok("Broma viral", 1, "Comedia", "juanito07", true));
        contenidos.add(new Podcast("Café y Código", 30, "Tecnología", "Luis Torres", "Spotify"));
        contenidos.add(new Pelicula("Inception", 130, "Ciencia Ficción", "Warner Bros"));

        // Agregar actores
        Actor actor1 = new Actor("Leonardo DiCaprio", 48, "EE.UU.");
        Actor actor2 = new Actor("Kate Winslet", 47, "Reino Unido");

        ((Pelicula) contenidos.get(0)).agregarActor(actor1); // Avatar
        ((Pelicula) contenidos.get(0)).agregarActor(actor2);
        ((Pelicula) contenidos.get(5)).agregarActor(actor1); // Inception

        // Agregar temporadas a la serie
        SerieDeTV serie = (SerieDeTV) contenidos.get(1);
        serie.agregarTemporada(new Temporada(1, 10));
        serie.agregarTemporada(new Temporada(2, 8));

        // Asignar investigador al documental
        Documental doc = (Documental) contenidos.get(2);
        doc.setInvestigador(new Investigador("Carl Sagan", "Astronomía"));

        // ================================
        // Inyección de dependencias (DIP)
        // ================================
        IContenidoService servicio = new ContenidoService(contenidos);
        MenuConsola vista = new MenuConsola();
        ContenidoController controlador = new ContenidoController(vista, servicio);

        // ================================
        // Iniciar aplicación (MVC en acción)
        // ================================
        controlador.iniciar();

        // ================================
        // Fin
        // ================================
        System.out.println("\n✅ ¡Gracias por usar el sistema!");
    }
}


