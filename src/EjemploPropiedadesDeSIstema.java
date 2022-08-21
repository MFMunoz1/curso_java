import java.util.Properties;

public class EjemploPropiedadesDeSIstema {
    public static void main(String[] args) {

        String username = System.getProperty("user.name");
        System.out.println("username = " + username);
        
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);
        
        String workpace = System.getProperty("user.dir");
        System.out.println("workpace = " + workpace);
        
        String java = System.getProperty("java.version");
        System.out.println("java = " + java);
        
        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator+ \"una linea nueva\" = " + lineSeparator2+ "una linea nueva");

        Properties p = System.getProperties();
        p.list(System.out);
    }

}
