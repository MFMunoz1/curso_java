import javax.swing.*;

public class E04NombreMasLargo {
    public static void main(String[] args) {

        String nombreCompleto1 = JOptionPane.showInputDialog(null, "Ingrese 1er nombre y apellido");
        String nombreCompleto2 = JOptionPane.showInputDialog(null, "Ingrese 2do nombre y apellido");
        String nombreCompleto3 = JOptionPane.showInputDialog(null, "Ingrese 3er nombre y apellido");
        String nombre1 = "";
        String nombre2 = "";
        String nombre3 = "";
        String[] arreglo1 = nombreCompleto1.split(" ");
        String[] arreglo2 = nombreCompleto2.split(" ");
        String[] arreglo3 = nombreCompleto3.split(" ");

        for (int i = 0; i < arreglo1.length; i++){
            nombre1 = arreglo1[0];
            for (int j = 0; j < arreglo2.length; j++){
                nombre2 = arreglo2[0];
            }
                for (int l = 0; l < arreglo3.length; l++){
                    nombre3 = arreglo3[0];
                }
        }
        /*System.out.println(nombre1.length());
        System.out.println(nombre2.length());
        System.out.println(nombre3.length());*/

       if (nombre1.length() > nombre2.length() && nombre1.length() > nombre3.length()) {
            System.out.println(nombre1);
        } else if (nombre2.length() > nombre1.length() && nombre2.length() > nombre3.length()) {
            System.out.println(nombre2);
        } else if (nombre3.length() > nombre1.length() && nombre3.length() > nombre2.length()) {
            System.out.println(nombre3);
        }
    }
}
