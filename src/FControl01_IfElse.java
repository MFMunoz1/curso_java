public class FControl01_IfElse {
    public static void main(String[] args) {
        float promedio = 6.5f;

        if(promedio >= 6.5){
            System.out.println("Felicitaciones, excelente promedio");
        }else if(promedio>= 6.0){
            System.out.println("Muy buen promedio");
        }else if(promedio>= 5.5){
            System.out.println("Bueno");
        }else if(promedio>= 5.0){
            System.out.println("Regular");
        }else if(promedio>= 4.0){
            System.out.println("Insuficiente");
        }else{
            System.out.println("Reprobado");
        }

        System.out.println(promedio);
    }
}
