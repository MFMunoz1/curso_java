import java.util.Scanner;

public class FControl_SwitchCase {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese numero mes");
        int mes = s.nextInt();
        String nombreMes = null;

        switch (mes){
            case 1:
                nombreMes= "Enero";
                break;
            case 2:
                nombreMes= "Febrero";
                break;
            case 3:
                nombreMes= "Marzo";
                break;
            default:
                nombreMes= "otro mes";
        }
        System.out.println(nombreMes);

        int num = 1;
        switch (num){
            case 0:
                System.out.println("el numero cero");
                break;
            case 1:
                System.out.println("numero uno");
                break;
            case 2:
                System.out.println("numero dos");
                break;
            case 3:
                System.out.println("numero tres");
                break;
            case 'a':
                System.out.println("caracter a");
                break;
            default:
                System.out.println("numero o caracter desconocido");
        }
    }
}
