import java.util.Scanner;

public class SentenciaEjercicio01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] valores = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número en la posición " + (i) + " :");
            valores[i] = s.nextInt();
        }

        for (int j= 0; j < valores.length; j++){
            if (valores[j] <= 10){
                System.out.println(j + " El número es menor que 10!");
            }else{
                System.out.println(j + " el numero es igual o mayor que 10!");
            }
        }







    }
}
