import javax.swing.*;

public class SistemasNumericos03 {

    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese numero entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error. Debe ingresar numero entero");
            //Si el error ocurre. Para repetir nuevamente el proceso se llama al metodo main
            main(args);
            //se sale del catch, finalizando la recursividad de la llamada al método main
            System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        //convierte entero a binario
        String resultadoBinario = "numero binario de " + numeroDecimal + " = "+ Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);


        int numeroBinario = 0b111110100; //500
        System.out.println("numeroBinario = " + numeroBinario);
        
        //convierte entero a octal
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        int numeroOctal = 0764; //500
        System.out.println("numeroOctal = " + numeroOctal);

        //convierte a hexadecimal
        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);

        int numeroHex = 0x1f4; //500
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;
        JOptionPane.showMessageDialog(null, mensaje );
    }
}
