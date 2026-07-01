import java.util.HashMap;
import java.util.List;

public class Tema5_InferenciaVar {
    public static void main(String[] args) {
        System.out.println("=== TEMA 5: INFERENCIA DE TIPOS CON VAR ===");
        
        // Simplifica la declaración de tipos genéricos complejos (Requiere Java 10+)
        var registros = new HashMap<String, List<Integer>>();
        
        // Insertamos datos en el mapa inferido
        registros.put("Notas_GrupoA", List.of(85, 90, 78));
        
        System.out.println("Contenido del mapa: " + registros);
        System.out.println("Tipo detectado: " + registros.getClass().getSimpleName());
    }
}