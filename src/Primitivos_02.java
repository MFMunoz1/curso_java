public class Primitivos_02 {
    //atributo de la clase principal fuera del método
    static float variableFlotante;

    public static void main(String[] args) {
        //ENTEROS
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a : "+Byte.BYTES);
        System.out.println("tipo byte corresponde en bytes a : "+Byte.SIZE);
        System.out.println("valor máximo de un byte : "+Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte : "+Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a : "+Short.BYTES);
        System.out.println("tipo short corresponde en bytes a : "+Short.SIZE);
        System.out.println("valor máximo de un short : "+Short.MAX_VALUE);
        System.out.println("valor minimo de un short : "+Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a : "+Integer.BYTES);
        System.out.println("tipo int corresponde en bytes a : "+Integer.SIZE);
        System.out.println("valor máximo de un int : "+Integer.MAX_VALUE);
        System.out.println("valor minimo de un int : "+Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a : "+Long.BYTES);
        System.out.println("tipo long corresponde en bytes a : "+Long.SIZE);
        System.out.println("valor máximo de un long : "+Long.MAX_VALUE);
        System.out.println("valor minimo de un long : "+Long.MIN_VALUE);


        //FLOTANTES
        //(1.5 * 10) ^4 = 1.5e4f
        //float realFloat = 1.5e4f;//15000f;
        float realFloat = 3.4f; //el punto se corre 38 veces a la izquierda
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde en byte a : "+Float.BYTES);
        System.out.println("tipo float corresponde en bytes a : "+Float.SIZE);
        System.out.println("valor máximo de un float : "+Float.MAX_VALUE);
        System.out.println("valor minimo de un float : "+Float.MIN_VALUE);

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo double corresponde en byte a : "+Double.BYTES);
        System.out.println("tipo double corresponde en bytes a : "+Double.SIZE);
        System.out.println("valor máximo de un double : "+Double.MAX_VALUE);
        System.out.println("valor minimo de un double : "+Double.MIN_VALUE);

        //variable flotante es llamada dentro del método
        System.out.println("variableFlotante = " + variableFlotante);

        //CHAR / CARACTERES
        char caracter = '\u0040'; //equivale a @
        char decimal = 64; //equivale a @
        var decimal2 = 64; //ahora equivale a int 64
        char simbolo = '@';

        System.out.println("char = " + caracter);
        System.out.println("tipo char corresponde en byte a : "+Character.BYTES);
        System.out.println("tipo char corresponde en bytes a : "+Character.SIZE);
        System.out.println("valor maximo de un char : "+Character.MAX_VALUE);
        System.out.println("valor minimo de un char : "+Character.MIN_VALUE);

        //BOOLEAN / LÓGICO
        boolean datologico = true;
        System.out.println("datologico = " + datologico);

        double d = 98765.43e-3; //98.76543
        System.out.println("d = " + d);
        float f = 1.2345e2f; //123.45
        System.out.println("f = " + f);

        datologico = d > f; //false
        System.out.println("datoLogico = " + datologico);

        boolean esIgual = 3-2 == 1; //true
        System.out.println("esIgual = " + esIgual);


    }
}
