package uni1a.controlador;

import uni1a.vista.MenuConsola;
import uni1a.interfaces.IContenidoService;
import uni1a.Pelicula;

public class ContenidoController {
    private MenuConsola vista;
    private IContenidoService servicio;

    public ContenidoController(MenuConsola vista, IContenidoService servicio) {
        this.vista = vista;
        this.servicio = servicio;
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            vista.mostrarMenuPrincipal();
            int opcion = vista.leerOpcion();

            switch (opcion) {
                case 1 -> {
                    servicio.mostrarTodos();
                    vista.pausar();
                }
                case 2 -> {
                    String nombre = vista.leerTexto("Nombre del actor");
                    for (Pelicula p : servicio.buscarPeliculasPorActor(nombre)) {
                        p.mostrarDetalles();
                    }
                    vista.pausar();
                }
                case 3 -> salir = true;
                default -> System.out.println("❌ Opción inválida");
            }
        }
    }
}
