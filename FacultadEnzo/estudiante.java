package FacultadEnzo;

class estudiante extends persona {

    // CONSTRUCTOR

    public estudiante(String nombre, String apellido, String legajo){
        super(nombre, apellido, Integer.parseInt(legajo));
    }

    // METODOS

    @Override
    public String toString() {
        return "Estudiante: "+ super.toString();
    }

    @Override
    public void modificarDatos(String nombre, String apellido, int legajo){

    }

}
