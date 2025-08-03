package uni1a.archivos;

import uni1a.Pelicula;

import java.io.*;
import java.util.*;

public class ArchivoPelicula {
    public static List<Pelicula> leer(String ruta) {
        List<Pelicula> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                lista.add(new Pelicula(partes[0], Integer.parseInt(partes[1]), partes[2], partes[3]));
            }
        } catch (IOException e) {
            System.err.println("Error al leer películas: " + e.getMessage());
        }
        return lista;
    }

    public static void guardar(List<Pelicula> lista, String ruta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (Pelicula p : lista) {
                bw.write(p.getTitulo() + "," + p.getDuracionEnMinutos() + "," + p.getGenero() + "," + p.getEstudio());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar películas: " + e.getMessage());
        }
    }
}
