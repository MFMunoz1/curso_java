import java.util.Scanner;

public class E01NumerosDeMayorAMenor {
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);
        StringBuilder s = new StringBuilder();

        System.out.println("Ingrese numero 1");
        int numero1 = escaner.nextInt();
        System.out.println("Ingrese numero 2");
        int numero2 = escaner.nextInt();

        if(numero1 > numero2){
            System.out.println(s.append(numero1).append(" ").append(numero2));
        }else{
            System.out.println((s.append(numero2).append(" ").append(numero1)));
        }
    }
}
