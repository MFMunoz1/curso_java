public class SecStringEjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna_imagen.jpeg";
        int i = archivo.lastIndexOf("."); //busca la ultima ocurrencia en que se encuentre un punto
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(14)); //retorna jpeg (EN DURO)
        System.out.println("archivo.length() = " + archivo.substring(i + 1)); //retorna todos los caracteres hacia adelante despues del punto = js, json, jpeg, pdf, png, etc



    }
}
