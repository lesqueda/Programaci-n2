package Seleccion;

public class Futbolista extends SeleccionFutbol {


    private String demarcacion;
    private String dorsal;


    public Futbolista(int id, String nombre, String apellido, int edad, String demarcacion, String dorsal) {
        super(id, nombre, apellido, edad);
        this.demarcacion = demarcacion;
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    //Métodos Especiales
    public void jugarPartido() {

    }

    public void Entrenar() {
        System.out.println("Entrena");
    }

}
