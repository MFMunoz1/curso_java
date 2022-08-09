import javax.swing.*;
import java.util.Scanner;

public class E02Factura {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        String nombre = "";
        double precio1 = 0;
        double precio2 = 0;



       try{
           System.out.println("Nombre");
           nombre = escaner.next();
           System.out.println("Valor 1 elemento");
           precio1 = escaner.nextDouble();
           System.out.println("Valor 2 elemento");
           precio2 = escaner.nextDouble();


       }catch(Exception err){
           //String error = s.append("ERROR").append(" ").append(err);
           System.out.println("ERROR EN EL TIPO DE DATO");
           main(args);
           System.exit(0);
        }

       double total = precio1 + precio2;
       double impuesto = 0.19;
       double impuestoAplicado = (total * impuesto);
       double totalImpuesto = total + impuestoAplicado;
        System.out.println("La factura producto de oficina tiene un total bruto de total de " +total+
                " con un impuesto de "+ impuestoAplicado+" y el monto después de impuesto es de "+ totalImpuesto);
    }
}
