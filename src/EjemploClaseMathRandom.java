public class EjemploClaseMathRandom {
    public static void main(String[] args) {
        String[] colores = {"azul", "rojo", "verde", "blanco", "negro"};
        double random = Math.random();
        System.out.println("random = " + random);
        random += colores.length;

        System.out.println("random = " + random);
        
        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores[(int) random] = " + colores[(int) random]);
        
    }
}
