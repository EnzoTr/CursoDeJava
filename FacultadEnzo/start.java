package FacultadEnzo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class start {

    public static void main (String args[]) {

        // CREAR FACULTAD
        facultad UNNE = new facultad("Universidad Nacional del Nordeste");

        // CREAR CARRERAS
        carrera ingElectromecanica = new carrera("Electromecanica");
        carrera licEconomia = new carrera("Licenciatura en Economía");
        carrera bioquimica = new carrera("Bioquímica");

        // AGREGAR CARRERAS A LA FACULTAD
        UNNE.agregarCarrera(ingElectromecanica);
        UNNE.agregarCarrera(licEconomia);
        UNNE.agregarCarrera(bioquimica);

        // ELIMINAR CARRERAS
        UNNE.eliminarCarrera("Bioquímica");

        // MOSTRAR CARRERAS
        UNNE.mostrarCarreras();

        //CREAR PROFESOR
        profesor javier = new profesor("Javier", "Varela", 27819, 50000, 6);
        profesor carla = new profesor("Carla", "Asula", 29335, 70000,3);

        // CALCULAR SUELDO
        javier.calcularSueldo();

        // CREAR ESTUDIANTES
        estudiante enzo = new estudiante("Enzo","Tur","27131");
        estudiante nayla = new estudiante("Nayla","Tur Espringer","26574");
        estudiante nicolas = new estudiante("Nicolas","Cerezo","28949");


        //CREAR MATERIAS
        materia estadistica = new materia("Estadística", javier);
        materia matematicas = new materia("Matemáticas", carla);

        //AGREGAR MATERIAS
        ingElectromecanica.agregarMateria(estadistica);
        licEconomia.agregarMateria(matematicas);

        //ELIMINAR MATERIA
        licEconomia.eliminarMateria("Estadística");

        // BUSCAR MATERIA
        carrera.encontrarMateria("Matemáticas");


        // AGREGAR ESTUDIANTES
        estadistica.agregarEstudiante(enzo);
        estadistica.agregarEstudiante(nicolas);
        estadistica.agregarEstudiante(nayla);

        // ELIMINAR ESTUDIANTE
        estadistica.eliminarEstudiante(28949);

        // MODIFICAR DATOS PROFESOR
        carla.modificarDatos("Carla", "Azula",29335);



    }

}
