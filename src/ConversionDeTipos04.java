public class ConversionDeTipos04 {
    public static void main(String[] args) {

        //1- Conversión de String a primitivos
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realSt = "98765.43e-3";
        double realDouble = Double.parseDouble(realSt);
        System.out.println("realDouble = " + realDouble);
        
        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        //2-Conversión de primitivos a String
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt); //recibe un int y lo convierte a string
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        //Alternativa en vez de usar Integer.toString
        otroNumeroStr = String.valueOf(otroNumeroInt+10); //recibe un int y lo convierte a string
        System.out.println("otroNumeroInt = " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble); //recibe un double y lo convierte a string
        System.out.println("otroRealStr = " + otroRealStr);

        //Convierte de float a string
        otroRealStr = Float.toString(1.234567e2f); //recibe un float y lo convierte a string
        //otroRealStr = StringValueOf(1.234567e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        //3- Convertir de entero a short
        int i = 22768;
        short s = (short)i; //fuerza la conversión del int a tipo short (casteo)
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        float f = (float) i ; //fuerza la conversión del int a tipo float (casteo)
        System.out.println("f = " + f);
        
    }
}
