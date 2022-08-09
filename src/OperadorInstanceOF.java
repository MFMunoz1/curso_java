import java.nio.charset.MalformedInputException;

public class OperadorInstanceOF {
    public static void main(String[] args) {

        String texto = "Creand0 objeto de la clase string... que tal";
        Integer num = 7;
        Boolean b1 = texto  instanceof String;
        System.out.println("texto es de tipo String = " + b1);

        b1 = texto  instanceof Object; //Object es padre de las clases de tipo texto, numéricas y booleanas
        System.out.println("texto es de tipo Object = " + b1);

        b1 = num  instanceof Integer;
        System.out.println("texto es de tipo Integer = " + b1);

        b1 = num  instanceof Number; //Number es padre de las clases numéricas //Integer extiende de Number
        System.out.println("numero es de tipo Number = " + b1);

        b1 = num  instanceof Object;
        System.out.println("numero es de tipo Object = " + b1);

        Double decimal = 45.54;
        b1 = decimal  instanceof Number;
        System.out.println("decimal es de tipo Number = " + b1);

        b1 = b1  instanceof Boolean;
        System.out.println("b1 es de tipo Boolean = " + b1);
    }
}
