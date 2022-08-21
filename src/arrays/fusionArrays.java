package arrays;

public class fusionArrays {
    public static void main(String[] args) {
//        int[] arrayA = {1,2,3,4};
//        int[] arrayB = {5,6,7,8};

        int[] arrayA = {1,2,3};
        int[] arrayB = {5,6,7,8};
//
//        int[] arrayA = {1,2,3,4};
//        int[] arrayB = {5,6,7};
//
//        int[] arrayA = {};
//        int[] arrayB = {};
//
//        int[] arrayA = {1};
//        int[] arrayB = {5};
//
//        int[] arrayA = {};
//        int[] arrayB = {5};
//
//        int[] arrayA = {1};
//        int[] arrayB = {};

        int[] arrayC;

        arrayC = fusionarArrays(arrayA, arrayB);

        for (int i=0;i<arrayC.length;i++) {
            System.out.println(arrayC[i]);
        }
    }
    public static int[] fusionarArrays(int[] arrayA, int[] arrayB){
        int [] arrayC = new int [arrayA.length + arrayB.length];

        if ()
        int aux= 0;
        for (int i = 0; i < arrayA.length; i++){
            arrayC[aux] = arrayA[i];
            aux++;
        }

        //int aux = 0;
        for (int i = 0; i < arrayB.length; i++){
            arrayC[aux] = arrayB[i];
            aux++;
        }
        return arrayC;
    }
}
