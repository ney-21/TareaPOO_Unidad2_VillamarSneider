package uni1a.archivos;

import uni1a.Temporada;

import java.io.*;
import java.util.*;

public class ArchivoTemporada {
    public static List<Temporada> leer(String ruta) {
        List<Temporada> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                lista.add(new Temporada(Integer.parseInt(partes[0]), Integer.parseInt(partes[1])));
            }
        } catch (IOException e) {
            System.err.println("Error al leer temporadas: " + e.getMessage());
        }
        return lista;
    }

    public static void guardar(List<Temporada> lista, String ruta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (Temporada t : lista) {
                bw.write(t.getNumeroTemporada() + "," + t.getCantidadEpisodios());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar temporadas: " + e.getMessage());
        }
    }
}
