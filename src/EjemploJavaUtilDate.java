import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date(); //Wed Aug 17 21:55:02 CLT 2022
        System.out.println("fecha = " + fecha);

        //se crea una instancia con el formateador de fecha con el patron de formato(standar): dd/mm/yyyy
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");//MMMM = Agosto
        String fechaStr = df.format(fecha);//format: retorna un string con la fecha formateada

        long j = 0;
        for (int i = 0; i < 10000000; i++){
            j+= i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();//retorna la fecha en milisegundos desde enero de 1979
        System.out.println("tiempoFinal = " + tiempoFinal);
        System.out.println("fechaStr = " + fechaStr); //17/08/2022
    }
}
