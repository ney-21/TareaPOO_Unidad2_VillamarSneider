package uni1a.archivos;

import uni1a.Investigador;

import java.io.*;
import java.util.*;

public class ArchivoInvestigador {
    public static List<Investigador> leer(String ruta) {
        List<Investigador> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                lista.add(new Investigador(partes[0], partes[1]));
            }
        } catch (IOException e) {
            System.err.println("Error al leer investigadores: " + e.getMessage());
        }
        return lista;
    }

    public static void guardar(List<Investigador> lista, String ruta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (Investigador i : lista) {
                bw.write(i.getNombre() + "," + i.getCampoInvestigacion());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar investigadores: " + e.getMessage());
        }
    }
}
