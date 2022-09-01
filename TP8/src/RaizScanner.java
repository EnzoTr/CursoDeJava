import javax.swing.*;

public class RaizScanner {
    public static void main(String[] args) {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("introduce un número:"));

        System.out.println("la raíz de "+numero1+" es = "+Math.sqrt(numero1));

    }
}
