package FacultadEnzo;

public abstract class persona {

    // ATRIBUTOS

    private String nombre;
    private String apellido;
    private int legajo;

    // CONSTRUCTOR

    public persona(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    // GETTERS & SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }


    // METODOS

    @Override
    public String toString() {
        return nombre + " " + apellido + "[Legajo: " + legajo+"]";
    }

    public abstract void modificarDatos(String nombre, String Apellido, int legajo);

}
