public class PasarPorReferencia {
    public static void main(String[] args) {

        //POR REFERENCIA SON MUTABLES: CAMBIA EL VALOR EN EL METODO Y TAMBIEN EN LA CLASE MAIN
        int[] edad  = {10, 11, 12};
        System.out.println("iniciamos el main con i =  = "); //10
        for ( int i = 0; i < edad.length; i++){
            System.out.println("edad[i]" + edad[i]);
        }
        System.out.println("Antes de llamar al metodo test");
        test(edad); //35

        System.out.println("Despues de llamar al metodo test");
        for ( int i = 0; i < edad.length; i++){
            System.out.println("edad[i]" + edad[i]);
        }
        System.out.println("finaliza el metodo main con los datos del arreglo modificado");

    }

    //METODO QUE MODIFICA EL VALOR DE i.
    //OBS: El valor de i no es modificado, sino que se crea una nueva instancia del objeto i con el valor 35, pero
    //se mantiene la instancia original donde i valía 10.
    public static void test(int[] edadArr){
        System.out.println("iniciamos el metodo test"); //
        for ( int i = 0; i < edadArr.length; i++){
            edadArr[i] = edadArr[i] + 20;
        }
        System.out.println("finaliza el metodo test");
    }
}
