import java.util.Scanner;

public class FControl01_IfElseEjercicio1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero de mes");

        int mes = s.nextInt();
        int numeroDías = 0;
        System.out.println("Ingrese el año");
        int anio = s.nextInt();
        if(mes == 1 || mes == 3 || mes==5 || mes == 7 || mes == 8|| mes == 10 ||mes == 12){
            numeroDías = 31;
        }else if( mes ==4 || mes == 6 || mes ==9 || mes == 11){
            numeroDías = 30;
        }else if ( mes == 2){
            if(anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))){
                numeroDías = 29;
            }else{
                numeroDías = 28;
            }
        }
        System.out.println(numeroDías);
    }
}
