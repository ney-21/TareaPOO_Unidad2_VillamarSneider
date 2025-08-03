package uni1a.archivos;

import uni1a.VideoTikTok;

import java.io.*;
import java.util.*;

public class ArchivoVideoTikTok {
    public static List<VideoTikTok> leer(String ruta) {
        List<VideoTikTok> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                lista.add(new VideoTikTok(partes[0], Integer.parseInt(partes[1]), partes[2], partes[3], Boolean.parseBoolean(partes[4])));
            }
        } catch (IOException e) {
            System.err.println("Error al leer videos TikTok: " + e.getMessage());
        }
        return lista;
    }

    public static void guardar(List<VideoTikTok> lista, String ruta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (VideoTikTok v : lista) {
                bw.write(v.getTitulo() + "," + v.getDuracionEnMinutos() + "," + v.getGenero() + "," + v.getUsuario() + "," + v.isTieneMusica());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar videos TikTok: " + e.getMessage());
        }
    }
}
