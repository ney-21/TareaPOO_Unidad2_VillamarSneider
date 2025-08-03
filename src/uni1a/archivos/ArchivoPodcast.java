package uni1a.archivos;

import uni1a.Podcast;

import java.io.*;
import java.util.*;

public class ArchivoPodcast {
    public static List<Podcast> leer(String ruta) {
        List<Podcast> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                lista.add(new Podcast(partes[0], Integer.parseInt(partes[1]), partes[2], partes[3], partes[4]));
            }
        } catch (IOException e) {
            System.err.println("Error al leer podcasts: " + e.getMessage());
        }
        return lista;
    }

    public static void guardar(List<Podcast> lista, String ruta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (Podcast p : lista) {
                bw.write(p.getTitulo() + "," + p.getDuracionEnMinutos() + "," + p.getGenero() + "," + p.getConductor() + "," + p.getPlataforma());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar podcasts: " + e.getMessage());
        }
    }
}
