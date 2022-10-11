package FacultadEnzo;

import java.util.LinkedList;
import javax.swing.*;

class carrera implements informacion {

    // VARIABLES

    private String nombre;
    private static LinkedList<materia> coleccionMaterias;

    // CONSTRUCTOR

    public carrera(String nombre){
        this.nombre = nombre;
        this.coleccionMaterias = new LinkedList<materia>();
    }

    // METODOS

    public void agregarMateria(materia newMateria){

        coleccionMaterias.add(newMateria);
    }

    // COMPLETAR

    public void eliminarMateria(String nombreMateria){
        for (materia materia1 : coleccionMaterias){
            if (materia1.getNombre() == nombreMateria){
                coleccionMaterias.remove(materia1);
                System.out.println("Materia eliminada");
                break;
            }else {
                System.out.println("Materia a eliminar no encontrada");
            }
        }
    }

    public static void encontrarMateria(String nombreMateria){

        for (materia materia1 : coleccionMaterias){
            if (materia1.getNombre() == nombreMateria){
                System.out.println("Materia encontrada");
                int eleccion = JOptionPane.showConfirmDialog(null,"¿Desea eliminar la materia?");
                if (eleccion == 0){
                    coleccionMaterias.remove(materia1);
                }else {
                    break;
                }
                break;
            }else {
                System.out.println("Materia NO encontrada");
                break;
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int verCantidad() {
        return coleccionMaterias.size();
    }

    @Override
    public String listarContenidos() {
        System.out.println("Materias en " + this.nombre + " :");
        for (materia Materia : coleccionMaterias){
            System.out.println(Materia);
        }
        return null;
    }
}
