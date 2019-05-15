package proyecyojorgeroger;

import javax.swing.JOptionPane;

public class ProyecyoJorgeRoger {

    //Variables Globales
    static int n;

    public static void main(String[] args) {
        String ax = JOptionPane.showInputDialog("Ingrese el tamanio de la matriz: ");
        JOptionPane.showMessageDialog(null, "El numero ingresado es: " + ax);
        n = Integer.parseInt(ax);//Se convierte el dato a entero
        String valor1 = JOptionPane.showInputDialog("Ingrese los valores que desea que se muestren en la matriz, Primer valor o valor Externo de la matriz: ");

        String valor2 = JOptionPane.showInputDialog("Ingrese Segundo valor o valor Interno de la matriz: ");
        JOptionPane.showMessageDialog(null, "Los valores son: " + valor1 + " Externo y " + valor2 + " Interno.");

        for (int x = 0; x < n; x++) {

            for (int y = 0; y < n; y++) {
                if (x == 0 || y == 0 || x == n - 1 || y == n - 1) {
                    System.out.print(valor1);
                    //System.out.print("1");
                } else {
                    System.out.print(valor2);
                    //System.out.print("0");
                }
            }
            System.out.println("");
        }

    }

}
