package uni1a.archivos;

import uni1a.SerieDeTV;

import java.io.*;
import java.util.*;

public class ArchivoSerieDeTV {
    public static List<SerieDeTV> leer(String ruta) {
        List<SerieDeTV> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                lista.add(new SerieDeTV(partes[0], Integer.parseInt(partes[1]), partes[2], Integer.parseInt(partes[3])));
            }
        } catch (IOException e) {
            System.err.println("Error al leer series: " + e.getMessage());
        }
        return lista;
    }

    public static void guardar(List<SerieDeTV> lista, String ruta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (SerieDeTV s : lista) {
                bw.write(s.getTitulo() + "," + s.getDuracionEnMinutos() + "," + s.getGenero() + "," + s.getTemporadas());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar series: " + e.getMessage());
        }
    }
}
