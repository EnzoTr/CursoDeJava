import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        int numeroRandom = (int) (Math.random() * 100 + 1);
        int valorUsuario = -1;
        int cantidadIntentos = 0;

        do{
            valorUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número del 1 al 100"));

            if (valorUsuario < numeroRandom){
                System.out.println("Intente con un número mayor");
                cantidadIntentos = cantidadIntentos + 1;
            }else if (valorUsuario > numeroRandom){
                System.out.println("Intente con un número menor");
                cantidadIntentos = cantidadIntentos + 1;
            }else{
                System.out.println("Correcto!");
                cantidadIntentos = cantidadIntentos + 1;
                System.out.println("Cantidad de intentos: "+cantidadIntentos);
                break;
            }
        }while (valorUsuario != numeroRandom);
    }
}