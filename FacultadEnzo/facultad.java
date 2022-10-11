package FacultadEnzo;

import java.util.LinkedList;

class facultad implements informacion {

    // VARIABLES

    private String nombre;
    private LinkedList<carrera> coleccionCarreras;

    // CONSTRUCTOR

    public facultad(String nombre) {
        this.nombre = nombre;
        this.coleccionCarreras = new LinkedList<carrera>();
    }

    // METODOS

    public void agregarCarrera(carrera nuevaCarrera) {

        coleccionCarreras.add(nuevaCarrera);
    }

    public void eliminarCarrera(String nombreCarrera) {
        for (carrera carrera1 : coleccionCarreras) {
            if (carrera1.getNombre() == nombreCarrera) {
                coleccionCarreras.remove(carrera1);
                break;
            } else {
                System.out.println("Carrera no encontrada");
            }
        }
    }

    public void mostrarCarreras() {
        System.out.println("Carreras en " + this.nombre);
        for (carrera carrera1 : coleccionCarreras) {
            System.out.println(" - " + carrera1.toString());
        }
    }

    @Override
    public int verCantidad() {
        return coleccionCarreras.size();
    }

    @Override
    public String listarContenidos() {
        System.out.println("Carreras en " + this.nombre + " :");
        for (carrera Carrera : coleccionCarreras){
            System.out.println(Carrera);
        }
        return null;
    }
}