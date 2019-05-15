package proyecyojorgeroger;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class ProyecyoJorgeRoger {

    //Variables Globales
    static int n;
    static String ax, valor1, valor2;

    public static void main(String[] args) {
        //Inicialización de variables
        valor1 = "1";
        valor2 = "0";
        n = 5;

        ax = JOptionPane.showInputDialog("Ingrese el tamanio de la matriz: ");
        JOptionPane.showMessageDialog(null, "El numero ingresado es: " + ax);
        n = Integer.parseInt(ax);//Se convierte el dato a entero

        int seleccion = JOptionPane.showOptionDialog(
                null,
                "Seleccione opcion",
                "Selector de opciones",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono por defecto.
                new Object[]{"1.Crear matriz por defecto(0,1)", "2.Crear matriz con valores distintos(x,y)"}, "Crear matriz por defecto(0,1)");

        if (seleccion != -1) {
            System.out.println("seleccionada opcion " + (seleccion + 1));
            if (seleccion == 1) {
                dibujar_matriz_otros_numeros();
            }
        }

        crear_matriz(valor1, valor2);
    }

    private static void dibujar_matriz_otros_numeros() throws HeadlessException {
        valor1 = JOptionPane.showInputDialog("Ingrese los valores que desea que se muestren en la matriz, Primer valor o valor Externo de la matriz: ");

        valor2 = JOptionPane.showInputDialog("Ingrese Segundo valor o valor Interno de la matriz: ");
        JOptionPane.showMessageDialog(null, "Los valores son: " + valor1 + " Externo y " + valor2 + " Interno.");

    }

    private static void crear_matriz(String valor1, String valor2) {
        for (int x = 0; x < n; x++) {

            for (int y = 0; y < n; y++) {
                if (x == 0 || y == 0 || x == n - 1 || y == n - 1) {
                    System.out.print(valor1);
                } else {
                    System.out.print(valor2);
                }
            }
            System.out.println("");
        }
    }

}
