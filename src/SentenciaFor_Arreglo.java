import javax.swing.*;

public class SentenciaFor_Arreglo {
    public static void main(String[] args) {

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        int count = nombres.length;
        for (int i = 0; i < count; i++){
            if(nombres[i].toLowerCase().equals("Andres")|| nombres[i].toLowerCase().equals("Pepa")){
                continue;
            }
            System.out.println(i+" - " + nombres[i]);
        }
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre");

        int conteo = nombres.length;
        boolean encontrado = false;
        for (int i = 0; i < conteo; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println(nombres[i]);
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar+ " encontrado");
        }else{
            JOptionPane.showMessageDialog(null, buscar+ " no fue encontrado");
        }
    }
}
