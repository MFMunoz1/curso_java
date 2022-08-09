import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericos03_EntradaScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Inicia la instancia que permite pedir datos de entrada por consola

        System.out.println("Ingrese un numero entero");//pide los datos al usuario por consola

        //String numeroStr = scanner.nextLine(); //obtiene los datos que el usuario ingresa por consola

        int numeroDecimal = 0;
        try {
            //permite ingresar el valor en consola y lo convierte directamente a numero
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr);
        }catch(Exception e){
            System.out.println("Error. Debe ingresar numero entero");
            //Si el error ocurre. Para repetir nuevamente el proceso se llama al metodo main
            main(args);
            //se sale del catch, finalizando la recursividad de la llamada al método main
            System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        //convierte entero a binario
        String resultadoBinario = "numero binario de " + numeroDecimal + " = "+ Integer.toBinaryString(numeroDecimal);

        
        //convierte entero a octal
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        //convierte a hexadecimal
        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;
        System.out.println(mensaje);
    }
}
