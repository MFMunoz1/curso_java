import java.util.Scanner;

public class SentenciaEjercicio02 {

    // Promedios < 4 Promedio > 5 Cantidad de nota 1 Promedio total
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];
        double promedioAprobado = 0.0;
        double promedioReprobado = 0.0;
        double acumuladoNotas = 0.0;
        int cantidadMa5 = 0;
        int cantidadMe4 = 0;
        int cantidadUnos = 0;
        double promedioTotal = 0.0;


        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese la nota en la posición " + (i) + " :");
            double temp = scanner.nextDouble();

            while (!(temp <= 7.0 && temp > 0)) {
                System.out.println("ingrese una nota valida");
                temp = scanner.nextDouble();
            }

            notas[i] = temp;
            acumuladoNotas += temp;

            if (temp > 5.0) {
                cantidadMa5++;
                promedioAprobado += temp;
                promedioAprobado = promedioAprobado / cantidadMa5;
            }
            if (temp < 4.0) {
                cantidadMe4++;
                promedioReprobado += temp;
                promedioReprobado = promedioReprobado / cantidadMe4;
            }
            if (temp == 1.0) {
                cantidadUnos++;
            }
        }

        acumuladoNotas = acumuladoNotas / notas.length;

        System.out.println(acumuladoNotas);
        System.out.println("el promedio mayor a 5 es: " + promedioAprobado + " - ");
        System.out.println("el promedio menor a 4 es: " + promedioReprobado + " - ");
        System.out.println("Cantidad Unos: " + cantidadUnos + " - ");
        System.out.println("el promedio total es: " + promedioTotal + " - ");
        System.out.println("Fin");

    }
}
