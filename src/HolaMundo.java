public class HolaMundo {
    public static void main(String[] args){
        String saludar = "Hola Mundo";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 11;
        System.out.println("numero = " + numero);
        boolean valor = true;
        String nombre;
        nombre = "Andrés";
        if(numero>10){
            nombre = "Juan";
        }
        System.out.println(nombre);
    }
}
