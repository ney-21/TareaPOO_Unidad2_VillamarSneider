package uni1a.archivos;

import uni1a.Actor;

import java.io.*;
import java.util.*;

public class ArchivoActor {
    public static List<Actor> leer(String ruta) {
        List<Actor> actores = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                Actor a = new Actor(partes[0], Integer.parseInt(partes[1]), partes[2]);
                actores.add(a);
            }
        } catch (IOException e) {
            System.err.println("Error al leer actores: " + e.getMessage());
        }
        return actores;
    }

    public static void guardar(List<Actor> actores, String ruta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (Actor a : actores) {
                bw.write(a.getNombre() + "," + a.getEdad() + "," + a.getNacionalidad());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar actores: " + e.getMessage());
        }
    }
}
