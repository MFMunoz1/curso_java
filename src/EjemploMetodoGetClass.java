import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "Hola que tal";

        Class strClass = texto.getClass(); //getClass retorna info sobre el objeto, su estructura interna sobre la clase
        System.out.println("strClass.getName() = " + strClass.getName());//java.lang.string
        System.out.println("strClass.getName() = " + strClass.getSimpleName());//String
        System.out.println("strClass.getName() = " + strClass.getPackageName()); //java.lang
        System.out.println("strClass.getName() = " + strClass);

        for(Method metodo: strClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());//lista todos los metodos de la clase String

        }

        Integer num = 34;
        Class intClass = num.getClass(); //java.lang.Integer
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass = " + intClass.getSuperclass());
        System.out.println("objClass = " + objClass);

        for(Method metodo: objClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());//lista todos los metodos de la clase Object

        }
    }
}
