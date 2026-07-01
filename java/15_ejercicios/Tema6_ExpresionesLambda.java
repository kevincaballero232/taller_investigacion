import java.util.ArrayList;
import java.util.List;

public class Tema6_ExpresionesLambda {
    public static void main(String[] args) {
        System.out.println("=== TEMA 6: EXPRESIONES LAMBDA ===");
        
        List<String> frutas = new ArrayList<>(List.of("Manzana", "Pera", "Kiwi", "Plátano"));
        
        frutas.sort((a, b) -> a.length() - b.length());
        
        System.out.println("Frutas ordenadas por longitud:");
        for (String fruta : frutas) {
            System.out.println(" - " + fruta);
        }
    }
}