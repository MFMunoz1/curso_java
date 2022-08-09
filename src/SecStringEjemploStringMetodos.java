public class SecStringEjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Fernanda";

        System.out.println("nombre.length() = " + nombre.length()); //retorna el numero de caracteres del string = 8
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); //FERNANDA
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); //fernanda
        System.out.println("nombre.equals(\"Fernanda\") = " + nombre.equals("Fernanda")); //true
        System.out.println("nombre.equals(\"fernanda\") = " + nombre.equals("fernanda")); //false
        System.out.println("nombre.equalsIgnoreCase(\"fernanda\") = " + nombre.equalsIgnoreCase("fernanda")); //compara el valor ignorando mayusculas y minusculas = true
        System.out.println("nombre.compareTo(\"Fernanda\") = " + nombre.compareTo("Fernanda")); ////si retorna cero, ambos valores son iguales = 0
        System.out.println("nombre.compareTo(\"Fernanda\") = " + nombre.compareTo("Barbara")); //si retorna, !0 son valores diferentes = 4
        System.out.println("nombre.charAt(\"Fernanda\") = " + nombre.charAt(0)); //retorna el caracter en el indice 0 = F
        System.out.println("nombre.charAt(\"Fernanda\") = " + nombre.charAt(1)); //retorna el caracter en el indice 1 = e
        System.out.println("nombre.charAt(\"Fernanda\") = " + nombre.charAt(5)); //retorna el caracter en el indice 5 = n
        System.out.println("nombre.charAt(\"Fernanda\") = " + nombre.charAt(nombre.length()-1)); //retorna el ultimo caracter = a
        System.out.println("nombre.substring(1) = " + nombre.substring(1)); //retorna los caracteres desde la posicion 1 en adelante = ernanda
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4)); //retorna los caracteres desde la posicion 1 hasta la posicion 4 = ern
        System.out.println("nombre.substring(4,8) = " + nombre.substring(4,8)); // retorna los caracteres desde la posicion 4 hasta la posicion 8 = anda
        System.out.println("nombre.substring(1) = " + nombre.substring(7)); //retorna el ultimo caracter = a
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-2)); //retorna los dos ultimos caracteres = da

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \"A\") = " + trabalenguas.replace("a", "A")); //reemplaza los caracteres a en minuscula por A en mayuscula = trAbAlenguAs
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); //retorna el indice numerico en que se encuentra el caracter "a" (primera ocurrencia) = 2
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.lastIndexOf('a')); //retorna el indice numerico en que se encuentra el caracter "a" (ultima ocurrencia) = 10
        System.out.println("trabalenguas.indexOf(\"z\") = " + trabalenguas.indexOf("z")); //si no encuentra el caracter, retorna -1. Si lo encuentra, retorna 0 o mayor a 0 = -1
        System.out.println("trabalenguas.indexOf(\"lenguas\") = " + trabalenguas.indexOf("lenguas")); //retorna 5
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("lenguas")); //similar al anterior, solo que contains devuelve un booleano, no un numero = true
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba")); //evalua si el string inicia o no con traba = true
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim()); //quita espacios en blanco a la izquierda y a la derecha









    }
}
