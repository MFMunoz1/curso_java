public class WrapperInteger {
    public static void main(String[] args) {

        //AUTOBOXING
        //CONVERTIR PRIMITIVO A OBJETO INTEGER (A CLASE WRAPPER)
        //primitivo
        int intPrimitivo = 32768;
        //crea un objeto con la literal de manera explicita
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        //crea el objeto mediante solo la literal (implicita)
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto = " + intObjeto);

        //UNBOXING
        //CONVERTIR OBJETO INTEGER(CLASE WRAPPER) A PRIMITIVO
        int num = intObjeto; //implicita
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue(); //explicita
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        //convierte de String a Entero
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shotObjeto = intObjeto.shortValue();
        System.out.println("shotObjeto = " + shotObjeto);

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);
    }
}
