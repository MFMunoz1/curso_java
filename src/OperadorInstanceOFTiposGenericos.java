public class OperadorInstanceOFTiposGenericos {
    public static void main(String[] args) {

        Object texto = "Creand0 objeto de la clase string... que tal";
        Number num = Integer.valueOf(7);//7;
        Boolean b1 = texto  instanceof String;
        System.out.println("texto es de tipo String = " + b1);

        b1 = texto  instanceof Object; //Object es padre de las clases de tipo texto, numéricas y booleanas
        System.out.println("texto es de tipo Object = " + b1);

        b1 = texto instanceof Integer; //el valor que contiene texto es String. Dará false
        System.out.println("texto es del tipo Integer = " + b1);

        b1 = num  instanceof Integer;
        System.out.println("numero es de tipo Integer = " + b1);

        b1 = num  instanceof Number; //Number es padre de las clases numéricas //Integer extiende de Number
        System.out.println("numero es de tipo Number = " + b1);

        b1 = num  instanceof Object;
        System.out.println("numero es de tipo Object = " + b1);

        b1 = num instanceof Long;
        System.out.println("numero es del tipo Long = " + b1);

        b1 = num instanceof Double;
        System.out.println("numero es del tipo Double = " + b1);

        Number decimal = Double.valueOf(45.54);//45.54;
        b1 = decimal instanceof Double;
        System.out.println("decimal es de tipo Double = " + b1);
        b1 = decimal  instanceof Number;
        System.out.println("decimal es de tipo Number = " + b1);

        b1 = b1  instanceof Boolean;
        System.out.println("b1 es de tipo Boolean = " + b1);
    }
}
