public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println(" Son el mismo objeto?(corresponden a la misma instancia)" + (num1 == num2)); //true

        num2 = 1000; //mismo valor que num1, pero aqui está creando otra instancia.

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //COMPARA POR INSTANCIAS
        System.out.println(" Son el mismo objeto?(corresponden a la misma instancia)" + (num1 == num2)); //false

        //Los objetos Integer se comparan por instancia (comparten o no la misma instancia)
        //Primitivos se comparan por valor

        //COMPARA POR VALORES
        System.out.println("Tienen el mismo valor? "+ (num1.equals(num2))); //equals = compara valores por referencia
        System.out.println("Tienen el mismo valor? "+ (num1.intValue()==(num2.intValue()))); //intValue= convierte valores por referencia a primiitvos

        num2 = 2000;
        boolean condicion = num1 > num2;//HACE EL AUTOBOXING IMPLICITO= CONVIERTE INTERNAMENTE DE REFERENCIA A PRIMITIVO (instancia a valor)
        System.out.println("condicion = " + condicion);

        boolean condicion2 = num1.intValue() > num2.intValue(); //HACE AUTOBOXING EXPLICITO
        System.out.println("condicion2 = " + condicion2);
    }
}
