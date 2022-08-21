import java.util.Map;

public class EjemploClaseMath {
    public static void main(String[] args) {
        
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);
        
        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);
        
        double max = Math.max(3.3, 1.2);
        System.out.println("max = " + max);
        
        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);
        
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);
        
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);
        
        long entero = Math.round(Math.PI);
        System.out.println("entero = " + entero);

        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3); //10 elevado a la potencia de 10 => 10^3
        System.out.println("potencia = " + potencia);
        
        double raiz = Math.sqrt(5);//la raiz cuadrada de 5
        System.out.println("raiz = " + raiz);

        //convertir de radianes a grados
        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("convertir de radianes a grados = " + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("convertir de grados a radianes = " + radianes);

        System.out.println("sin(98) "+ Math.sin(radianes));
        System.out.println("sin(98) "+ Math.cos(radianes));

        radianes = Math.toRadians(100.00);
        System.out.println("cos(100) "+ Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("cos(100) "+ Math.cos(radianes));

    }
}
