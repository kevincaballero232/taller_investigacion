import java.util.List;
import java.util.stream.Collectors;

public class Tema8_ApiStreams {
    public static void main(String[] args) {
        System.out.println("=== TEMA 8: API STREAMS ===");
        
        List<String> nombres = List.of("Ana", "Luis", "Carlos", "Marta", "Juan");
        
       
        List<String> resultado = nombres.stream()
            .filter(nombre -> nombre.length() > 3)
            .map(String::toUpperCase)
            .collect(Collectors.toList());
            
        System.out.println("Nombres filtrados y en mayúsculas: " + resultado);
    }
}