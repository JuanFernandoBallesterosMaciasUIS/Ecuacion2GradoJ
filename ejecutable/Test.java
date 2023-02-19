package ejecutable;

import javax.swing.JOptionPane;

public class Test {

    public static void main(String[] args) {
        // declaración de variables

        int a;
        int b;
        int c;
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el coeficiente a:"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el coeficiente b:"));
        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el coeficiente c:"));

        // Calcular el discriminante
        int discriminante = b * b - 4 * a * c;

        if (discriminante < 0) {
            JOptionPane.showMessageDialog(null, "La ecuación no tiene raíces reales.");
        } else {

            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            JOptionPane.showMessageDialog(null, "Las raíces de la ecuación son: " + x1 + " y " + x2);
        }
    }

}