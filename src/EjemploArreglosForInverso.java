import java.util.Arrays;

public class EjemploArreglosForInverso {

    public static void main(String[] args) {

         //String[] productos = new String[7];
         String[] productos = {"Kingston","Samsung galaxy","Disco SSD","Asus note",
                              "Mac","Chromecast","Bici Oxford"};

         int total = productos.length;

         /*productos[0] = "Kingston";
         productos[1] = "Samsung galaxy";
         productos[2] = "Disco SSD";
         productos[3] = "Asus note";
         productos[4] = "Mac";
         productos[5] = "Chromecast";
         productos[6] = "Bici Oxford";
         */
         Arrays.sort(productos);

         System.out.println("===Usando for");
         for (int i = 0; i < total; i++){
              System.out.println("para indice "+ i + " : "+ productos[i]);
         }

         System.out.println("====Usando for inverso");
         for ( int i =0; i < total; i++){
              System.out.println("para i = " + (total-1-i) + "valor: "+ productos[total-1-i]);
         }
         System.out.println("====Usando for inverso");

         for (int i = total-1 ; i >=0; i--){
              System.out.println("para i = " + i + "valor: "+ productos[i]);
         }
    }
}
