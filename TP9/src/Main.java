import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        int genero = Integer.parseInt(JOptionPane.showInputDialog("0  =  Hombre         1  =  Mujer"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Altura en CM"));

        if (genero == 0){
            System.out.println("Su peso ideal es: "+(altura-110)+"kg");
        } else if (genero == 1){
            System.out.println("Su peso ideal es: "+(altura-120)+"kg");
        } else {
            System.out.println("ERROR 404 [NOT FOUND]");
        }
        
    }
}