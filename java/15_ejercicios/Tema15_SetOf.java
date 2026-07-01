import java.util.Set;

public class Tema15_SetOf {
    public static void main(String[] args) {
        System.out.println("=== TEMA 15: SET.OF() ===");
        
       
        Set<String> codigosError = Set.of("ERR_404", "ERR_500", "ERR_403");
        
        System.out.println("Conjunto de códigos únicos de error:");
        codigosError.forEach(codigo -> System.out.println(" -> Código: " + codigo));
    }
}