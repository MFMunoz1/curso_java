import javax.swing.*;

public class OperadorAritmetico {

    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;
        System.out.println("suma = " + suma);
        System.out.println("( i + j ) = " + ( i + j ));
        
        int resta = i -j;
        System.out.println("resta = " + resta);
        System.out.println("(i-j)  = " + (i-j) );
        
        int multi = i * j;
        System.out.println("multiplicacion = " + multi);

        int div = i / j; // la división se aproxima a 1, ya que la variable solo tolera valores enteros
        float div2 = (float) i / j; //fuerza a los enteros i y j a manejar valores de tipo float
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        int resto = i % j; //retorna el modulo/resto de la division
        System.out.println("resto = " + resto);

        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
        if(numero % 2 == 0){
            System.out.println("numero par = " + numero);
        }else{
            System.out.println("numero impar = " + numero);
        }

    }
}
