package Seleccion;

public class Entrenador extends SeleccionFutbol {


    private String idFederacion;

    public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {

    }

    public void dirigirEntrenamiento() {
        System.out.println("Dirige el Entrenamiento");

    }
}
