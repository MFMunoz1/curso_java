import java.util.Arrays;

public class EjemploArreglosFor {

    public static void main(String[] args) {

         String[] productos = new String[7];
         int total = productos.length;

         productos[0] = "Kingston";
         productos[1] = "Samsung galaxy";
         productos[2] = "Disco SSD";
         productos[3] = "Asus note";
         productos[4] = "Mac";
         productos[5] = "Chromecast";
         productos[6] = "Bici Oxford";

         Arrays.sort(productos);

         System.out.println("===Usando for");
         for (int i = 0; i < total; i++){
              System.out.println("para indice "+ i + " : "+ productos[i]);
         }
         System.out.println("===Usando foreach");
         for( String prod: productos){
              System.out.println("prod = " + prod);
         }

         System.out.println("===Usando while");
         int i = 0;
         while(i < total){
              System.out.println("para indice "+ i + " : "+ productos[i]);
              i++;
         }

         int[] numeros = new int[4];
         int totalNumeros = numeros.length;

         //se asignan los valores del array mediante el for
         for (int k = 0; k < totalNumeros; i++){
              numeros[k] = k * 3;
         }
         //se accede a los valores del array
         for (int k = 0; k < totalNumeros; i++){
              System.out.println("numeros[k] = " + numeros[k]);
         }

    }
}
