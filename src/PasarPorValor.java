public class PasarPorValor {
    public static void main(String[] args) {

        //PRIMITIVOS SON INMUTABLES: CAMBIA EL VALOR EN EL METODO, PERO NO EN LA CLASE MAIN
        int i = 10;
        System.out.println("iniciamos el main con i =  = " + i); //10
        test(i); //35
        System.out.println("finaliza el metodo main con el valor de i (se mantiene igual) = " + i); //10
        /*Integer num1 = 1;
        Integer num2 = 1;

        if(num1.equals(num2)){
            System.out.println("(num1+num2) = " + (num1+num2));
        }*/
    }

    //METODO QUE MODIFICA EL VALOR DE i.
    //OBS: El valor de i no es modificado, sino que se crea una nueva instancia del objeto i con el valor 35, pero
    //se mantiene la instancia original donde i valía 10.
    public static void test(int i){
        System.out.println("iniciamos el metodo test i = " + i); //10
        i =35; //modifica el valor de i (10) a 35
        System.out.println("finaliza con i = " + i); //35
    }
}
