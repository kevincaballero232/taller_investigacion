import java.util.List;

public class Tema14_ListOf {
    public static void main(String[] args) {
        System.out.println("=== TEMA 14: LIST.OF() ===");
        
       
        List<String> roles = List.of("Administrador", "Soporte", "Usuario");
        
        System.out.println("Lista de roles configurados:");
        for (String rol : roles) {
            System.out.println(" - " + rol);
        }
        
        
    }
}