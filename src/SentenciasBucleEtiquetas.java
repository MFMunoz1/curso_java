public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle:
        for (int i = 1; i <= 7; i++) {
            int j = 1;
            while (j <= 8) {
                if (i == 6 || i == 7) {
                    System.out.println("Dia "+ i + " descanso de fin de semana");
                    continue bucle;
                }
                System.out.println("Dia " + i + " trabajando a las "+ j + "hrs. ");
                j++;
            }
        }
    }
}
