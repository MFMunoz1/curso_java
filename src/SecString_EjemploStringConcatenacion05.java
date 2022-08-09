public class SecString_EjemploStringConcatenacion05 {
    public static void main(String[] args) {

        String curso = "Programacion java"; //objeto creado de forma literal (implícita)
        String profesor = "Andrés Guzmán";

        String detalle = curso + " con el instructor "+profesor ;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;
        System.out.println(detalle + (numeroA + numeroB));

        String detalle2 = curso.concat(" con ").concat(profesor); //concat permite concatenar 2 string : alternativa a " + "
        System.out.println("detalle2 = " + detalle2);
        
    }
}
