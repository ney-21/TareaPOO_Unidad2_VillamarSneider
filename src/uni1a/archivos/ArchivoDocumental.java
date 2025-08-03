package uni1a.archivos;

import uni1a.Documental;

import java.io.*;
import java.util.*;

public class ArchivoDocumental {
    public static List<Documental> leer(String ruta) {
        List<Documental> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                lista.add(new Documental(partes[0], Integer.parseInt(partes[1]), partes[2], partes[3]));
            }
        } catch (IOException e) {
            System.err.println("Error al leer documentales: " + e.getMessage());
        }
        return lista;
    }

    public static void guardar(List<Documental> lista, String ruta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (Documental d : lista) {
                bw.write(d.getTitulo() + "," + d.getDuracionEnMinutos() + "," + d.getGenero() + "," + d.getTema());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar documentales: " + e.getMessage());
        }
    }
}
