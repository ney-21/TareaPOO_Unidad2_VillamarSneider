package poo;

import uni1a.*;

public class PruebaAudioVisual {

    public static void main(String[] args) {
    	System.out.println("==============================================");
    	System.out.println("🎬 Bienvenido al Sistema de Gestión de Contenidos Audiovisuales");
    	System.out.println("==============================================\n");

        // Crear instancias
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[6];
        contenidos[0] = new Pelicula("Avatar", 125, "Acción", "20th Century Studios");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasía", 8);
        contenidos[2] = new Documental("Cosmos", 45, "Ciencia", "Astronomía");
        contenidos[3] = new VideoTikTok("Broma viral", 1, "Comedia", "juanito07", true);
        contenidos[4] = new Podcast("Café y Código", 30, "Tecnología", "Luis Torres", "Spotify");
        contenidos[5] = new Pelicula("Inception", 130, "Ciencia Ficción", "Warner Bros");

        // Película: Agregar actores
        Actor actor1 = new Actor("Leonardo DiCaprio", 48, "EE.UU.");
        Actor actor2 = new Actor("Kate Winslet", 47, "Reino Unido");
        ((Pelicula) contenidos[0]).agregarActor(actor1);
        ((Pelicula) contenidos[0]).agregarActor(actor2);
        ((Pelicula) contenidos[5]).agregarActor(actor1); // Reutilización de actor

        // Serie: Agregar temporadas
        SerieDeTV serie = (SerieDeTV) contenidos[1];
        serie.agregarTemporada(new Temporada(1, 10));
        serie.agregarTemporada(new Temporada(2, 8));

        // Documental: Agregar investigador
        Investigador investigador1 = new Investigador("Carl Sagan", "Astronomía");
        ((Documental) contenidos[2]).setInvestigador(investigador1);

        // Simulación de edición: cambiar nombre de un actor
        actor1.setNombre("Leonardo Wilhelm DiCaprio");

        // Mostrar los detalles
        System.out.println("🧾 Mostrando todos los contenidos audiovisuales:\n");
        for (ContenidoAudiovisual c : contenidos) {
            c.mostrarDetalles();
        }

        // Buscar y mostrar películas con un actor específico (opcional)
        String actorBuscado = "Leonardo Wilhelm DiCaprio";
        System.out.println("🔍 Buscando películas con el actor: " + actorBuscado);
        for (ContenidoAudiovisual c : contenidos) {
            if (c instanceof Pelicula) {
                Pelicula p = (Pelicula) c;
                for (Actor a : p.getActores()) {
                    if (a.getNombre().equals(actorBuscado)) {
                        System.out.println("🎞 " + p.getTitulo() + " incluye al actor " + a.getNombre());
                    }
                }
            }
        }
    }
}

