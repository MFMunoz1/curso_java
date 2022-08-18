import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd'");
        try {
            //FECHA INGRESADA POR EL USUARIO
            Date fecha = format.parse(escaner.next()); //1998-02-01
            System.out.println("fecha = " + fecha); //Sun Feb 01 00:00:00 CLST 1998
            System.out.println("format = " + format.format(fecha)); //1998-02-01

            //FECHA ACTUAL
            Date fecha2 = new Date();
            System.out.println(fecha2);

            if (fecha.after(fecha2)){
                System.out.println("fecha (del usuario) es despues que la fecha2 (actual)");
            }else if (fecha.before(fecha2)){
                System.out.println("fecha (del usuario) es antes que la fecha2 (actual)");
            } else if (fecha.equals(fecha2)) {
                System.out.println("fecha es igual a fecha2");
            }

            if (fecha.compareTo(fecha2) > 0){
                System.out.println("fecha (del usuario) es despues que la fecha2 (actual)");
            }else if (fecha.compareTo(fecha2) < 0){
                System.out.println("fecha (del usuario) es antes que la fecha2 (actual)");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("fecha es igual a fecha2");
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
