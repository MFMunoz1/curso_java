public class AutoboxingInteger {
    public static void main(String[] args) {
        //Arreglo de objetos por referencia
        //Convirtiendo primitivos en referencia
        //Integer[] enteros = {Integer.ValueOf(1,2,3,4,5,6,7,8,9,10, 11,12,13,14,15)} //explicita
        Integer[] enteros = {1,2,3,4,5,6,7,8,9,10, 11,12,13,14,15}; //implicita

        int suma = 0;
        for(Integer i: enteros){
            if (i.intValue() % 2 == 2){ //i.intValue() -> retorna el arreglo de integer como un int (primitivo)
                suma += i.intValue();
            }
        }
        System.out.println("suma = " + suma);

        suma = 0;
        for(Integer i: enteros){
            if (i % 2 == 2){ //i.intValue() -> retorna el arreglo de integer como un int (primitivo)
                suma += i;
            }
        }
        System.out.println("suma = " + suma);
}
}
