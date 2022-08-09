import java.util.Scanner;

public class E03EstanqueGasolina {
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);


        System.out.println("Capacidad");
        int litros = escaner.nextInt();


        if (litros == 70){
            System.out.println("Estanque lleno");
        }else if(litros > 60 && litros <70){
            System.out.println("Estanque casi lleno");
        }else if(litros > 40 && litros <60){
            System.out.println("Estanque 3/4");
        }else if(litros > 35 && litros <40){
            System.out.println("Medio estanque");
        }else if(litros > 20 && litros <35){
            System.out.println("Suficiente");
        }else if(litros > 1 && litros <20){
            System.out.println("Insuficiente");
        }else{
            System.out.println("Numero fuera de rango");
        }

        /*capacidad = litros == 70 ? "Estanque lleno" : "";
        capacidad = litros > 60 && litros <70 ? "Estanque casi lleno" : "";
        capacidad = litros > 40 && litros <60 ? "Estanque 3/4" : "";
        capacidad = litros > 35 && litros <40 ? "Medio estanque" : "";
        capacidad = litros > 20 && litros <35 ? "Suficiente" : "";
        capacidad = litros > 1 && litros <20 ? "Insuficiente" : "";
        System.out.println(capacidad); */



    }
}
