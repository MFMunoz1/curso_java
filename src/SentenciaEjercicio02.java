import java.util.Scanner;

public class SentenciaEjercicio02 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double[] notas = new double[4];
        double promedioMa5 = 0.0;
        double promedioMe4 = 0.0;
        int cantidadMa5 = 0;
        int cantidadMe4 = 0;
        int cantidadUnos = 0;
        double promedio = 0.0;
        int cantProm = 0;
        double promedioTotal = 0.0;


        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese la nota en la posición " + (i) + " :");
            notas[i] = s.nextDouble();
            if (notas[i] > 7.0) {
                System.out.println("nota invalida");
                break;
            }

        }

        for (int j = 0; j < notas.length; j++) {
            if (notas[j] > 5.0) {
                cantidadMa5++;
                promedioMa5 += notas[j];
                promedioMa5 = promedioMa5 / cantidadMa5;
            }
        }
        for (int l = 0; l < notas.length; l++) {
            if (notas[l] < 4.0) {
                cantidadMe4++;
                promedioMe4 += notas[l];
                promedioMe4 = promedioMe4 / cantidadMe4;
            }
        }

        for (int k = 0; k < notas.length; k++) {
            if (notas[k] == 1.0) {
                cantidadUnos++;

            }
        }

        for (int g = 0; g < notas.length; g++) {
            cantProm++;
            promedio += notas[g];
            promedioTotal = promedio / cantProm;
        }


            System.out.println("el promedio mayor a 5 es: " + promedioMa5 + " - ");
            System.out.println("el promedio menor a 4 es: " + promedioMe4 + " - ");
            System.out.println("Cantidad Unos: " + cantidadUnos + " - ");
            System.out.println("el promedio total es: " + promedioTotal + " - ");
            System.out.println("Fin");

    }
}
