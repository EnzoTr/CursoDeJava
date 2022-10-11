package FacultadEnzo;

import java.util.LinkedList;

class materia implements informacion {

    // VARIABLES

    private String nombre;
    private profesor titular;
    private LinkedList<estudiante> coleccionEstudiantes;

    // CONSTRUCTOR

    public materia(String nombre, profesor titular) {
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiantes = new LinkedList<estudiante>();
    }

    // GETTERS & SETTERS

    public String getNombre() {
        return nombre;
    }


    // METODOS

    public void agregarEstudiante(estudiante newEstudiante){
        this.coleccionEstudiantes.add(newEstudiante);
    }

    public void eliminarEstudiante(int legajo){
        boolean encontro = false;
        for(estudiante estudiante: coleccionEstudiantes){
            if(estudiante.getLegajo()==legajo){
                coleccionEstudiantes.remove(estudiante);
                encontro = true;
                break;
            }
        }
        if (encontro){
            System.out.println("Estudiante eliminado de la materia");
        }else{
            System.out.println("Estudiante no encontrado");
        }
    }


    @Override
    public String toString() {
        return "DATOS DE LA MATERIA \n" +
                "Materia: "+ nombre + "\n" +
                "Titular: " + titular + "\n";
    }

    public void listarEstudiantes(){
        System.out.println("LISTADO DE ESTUDIANTES");
        for(estudiante estudiante: coleccionEstudiantes){
            System.out.println(estudiante.toString());
        }
    }

    @Override
    public int verCantidad() {
        return coleccionEstudiantes.size();
    }

    @Override
    public String listarContenidos() {
        System.out.println("Estudiantes en " + this.nombre + " :");
        for (estudiante Estudiante : coleccionEstudiantes){
            System.out.println(Estudiante);
        }
        return null;
    }
}
