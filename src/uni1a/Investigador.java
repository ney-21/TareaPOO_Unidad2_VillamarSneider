package uni1a;

public class Investigador {
    private String nombre;
    private String campoInvestigacion;

    public Investigador(String nombre, String campoInvestigacion) {
        this.nombre = nombre;
        this.campoInvestigacion = campoInvestigacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCampoInvestigacion() {
        return campoInvestigacion;
    }

    public void setCampoInvestigacion(String campoInvestigacion) {
        this.campoInvestigacion = campoInvestigacion;
    }
}
