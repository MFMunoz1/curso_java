import java.util.Locale;

public class SecStringEjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null; //devuelve true

        System.out.println("esNulo = " + esNulo);

        if(esNulo){
            curso = "Programacion java";
        }

        boolean esVacio = curso.length() == 0; //devuelve true
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty(); //is empty = es vacio
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank(); //es null o tiene espacios vacios
        System.out.println("esBlanco = " + esBlanco);
      /*  //si esVacio tiene mas de 0 caracteres (significa que no es un string vacio)
        if(!esVacio2){
            System.out.println(curso.toUpperCase());
            System.out.println(curso.concat(" desde cero!"));
        }
      */
        //cuando sea distinto de espacios en blanco o de null
        if(!esBlanco){
            System.out.println(curso.toUpperCase());
            System.out.println(curso.concat(" desde cero!"));
        }
    }
}
