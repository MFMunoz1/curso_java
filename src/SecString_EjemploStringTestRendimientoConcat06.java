public class SecString_EjemploStringTestRendimientoConcat06 {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;
        StringBuilder sb = new StringBuilder(a);//permite anexar (concatenar) elementos con el metodo "append"

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++){
            //c = c.concat(a).concat(b).concat("\n"); //500 => 3mm, 1000 => 7mm
            //c += a + b + "\n"; //500 => 25mm, 1000 => 26mm
            sb.append(a).append(b).append("\n");//500 => 0mm , 1000 => 0mm //sb retorna la instancia del objeto String Builder, por eso se puede llamar de forma encadenada los metodos del objeto

        }
        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        //System.out.println(c);
        System.out.println("sb.toString() = " + sb.toString()); //sb.toString genera el string completo (la concatenacion completa)
    }
}
