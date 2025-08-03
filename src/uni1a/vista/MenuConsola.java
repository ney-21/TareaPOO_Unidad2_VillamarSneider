package uni1a.vista;

import java.util.Scanner;

public class MenuConsola {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenuPrincipal() {
        System.out.println("==============================================");
        System.out.println("🎬 Sistema de Gestión de Contenidos Audiovisuales");
        System.out.println("==============================================");
        System.out.println("1. Ver todos los contenidos");
        System.out.println("2. Buscar películas por actor");
        System.out.println("3. Salir");
    }

    public int leerOpcion() {
        System.out.print("Seleccione una opción: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String leerTexto(String mensaje) {
        System.out.print(mensaje + ": ");
        return scanner.nextLine();
    }

    public void pausar() {
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine();
    }
}
