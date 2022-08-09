public class EjemploStringMetodoArreglos {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray()); //convierte el string en un arreglo de caracteres

        char[] arreglo = trabalenguas.toCharArray();//arreglo de elementos de tipo char
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        //iteracion por cada caracter del arreglo que contiene a trabalenguas
        for (int i = 0; i < largo; i++){
            System.out.println(" arreglo = " + arreglo[i]); //itera por el elemento (caracter) y su indice
        }
        System.out.println();
        System.out.println("trabalenguas = " + trabalenguas.split("a")); //"a" es un separador de elementos para el arreglo del string trabalenguas = tr|b|lengu|s => genera un arreglo de 4 elementos
        String[] arreglo2 = trabalenguas.split("a"); //split retorna un arreglo de tipo string
        int l = arreglo2.length;

        for (int j = 0; j < l; j++){
            System.out.println("arreglo2[i] = " + arreglo2[j]);
        }
        String archivo = "alguna_imagen.jpeg";
        String[] archivoArr = archivo.split("\\.");//ó [.] //retorna un array de strings separando por el caracter punto
        l = archivoArr.length;
        for (int j = 0; j < l; j++){
            System.out.println("arreglo2[i] = " + archivoArr[j]);
        }
        System.out.println("extension = " + archivoArr[archivoArr.length - 1]); //retorna el ultimo elemento del array
    }
}
