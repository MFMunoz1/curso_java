public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        //BOXING = DE PRIMITIVO A REFERENCIA
        boolean primBoolean = num1 > num2; //false
        //Boolean objBoolean = primBoolean; //-> implicita
        Boolean objBoolean = Boolean.valueOf(primBoolean); //-> explicita //se crea a partir de un primitivo
        Boolean objBoolean2 = Boolean.valueOf("false");//se crea a traves de un string
        Boolean objBoolean3 = true; //Boolean objBoolean3 = Boolean.valueOf(true)

        System.out.println("primBoolean" + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);


        System.out.println("Comparando dos objetos boolean: "+ (objBoolean == objBoolean2));
        System.out.println("Comparando dos objetos boolean: "+ (objBoolean.equals(objBoolean2)));
        System.out.println("Comparando dos objetos boolean: "+ (objBoolean2 == objBoolean3));
        System.out.println("Comparando dos objetos boolean: "+ (objBoolean == objBoolean3));


        boolean primBoolean2 = objBoolean2.booleanValue(); //DE REFERENCIA A PRIMITIVO = UNBOXING





    }
}
