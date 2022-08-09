public class SecString_EjemploStringInmutable05_3 {
    public static void main(String[] args) {

        String curso = "Programacion java"; 
        String profesor = "Andrés Guzmán";

        String resultado = curso.concat(profesor);
        System.out.println("resultado = " + resultado);
        //Otra manera de concatenar alternativa a concat y "+" : Transform
        String resultado2 = curso.transform((c) ->{
            return c + " con " + profesor;
        });
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);
        String resultado3 = resultado.replace("a", "A");//reemplaza las "a" minuscula por "A" mayuscula
        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);
    }
}
