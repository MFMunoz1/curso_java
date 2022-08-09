public class SecString_EjemploString05 {
    public static void main(String[] args) {

        String curso = "Programacion java"; //objeto creado de forma literal (implícita)
        String curso2 = new String("Programacion java"); //objeto creado de forma explicita con el new
        boolean esIgual = curso==curso2; //compara un objeto creado de forma implícita con otro creado de forma explícita
        System.out.println("curso==curso2 = " + esIgual); //será false
        
        esIgual = curso.equals(curso2); //compara el valor del string
        //esIgual = curso.equalsIgnoreCase(curso2); //ignora mayusculas, minusculas y tildes
        System.out.println("curso.equals(curso2) = " + esIgual);

        String curso3 = "Programacion java"; //objeto creado de forma literal (implícita)
        esIgual = curso == curso3; //ocupa el mismo objeto, ya que ambos son creados de forma implícita y tienen el mismo valor.
        System.out.println("curso == curso3 = " + curso3); //Será true

    }
}
