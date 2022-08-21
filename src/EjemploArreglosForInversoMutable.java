import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

     public static void arregloInverso(String[] arreglo){
          int total2 = arreglo.length;
          int total = arreglo.length;

          for (int i = 0; i < total2; i++){
               String actual = arreglo[i];
               String inverso = arreglo[total - 1 - i]; //7-1=6, 7-2=5....
               arreglo[i]= inverso;
               arreglo[total - 1 - i] = actual;
               total2--;
          }
     }

    public static void main(String[] args) {

         String[] productos = {"Kingston","Samsung galaxy","Disco SSD","Asus note",
                              "Mac","Chromecast","Bici Oxford"};
         
         int total = productos.length;

         Arrays.sort(productos);

         //arregloInverso(productos);

         Collections.reverse(Arrays.asList(productos));
         for (int i = 0; i < total; i++){
              System.out.println("para indice "+ i + " : "+ productos[i]);
         }
    }
}
