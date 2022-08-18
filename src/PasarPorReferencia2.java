class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        //this = apunta a un atributo de esta misma clase
        this.nombre = nuevoNombre;
    }
    public String leerNombre(){
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Andres");
        System.out.println("iniciamos el metodo main");

        System.out.println("persona.nombre "+ persona.leerNombre());
        System.out.println("Antes de llamar al metodo test");
        test(persona);

        System.out.println("Despues de llamar al metodo test");
        System.out.println("persona.nombre "+ persona.leerNombre());
        System.out.println("finaliza el metodo main con los datos de la persona modificados");

    }

    //METODO QUE MODIFICA EL VALOR DE i.
    //OBS: El valor de i no es modificado, sino que se crea una nueva instancia del objeto i con el valor 35, pero
    //se mantiene la instancia original donde i valía 10.
    public static void test(Persona nombrePersona){
        System.out.println("iniciamos el metodo test"); //
        nombrePersona.modificarNombre("Pepe");
        System.out.println("finaliza el metodo test");
    }
}
