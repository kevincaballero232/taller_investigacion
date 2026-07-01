import java.util.HashMap;
import java.util.List;

public class Tema5_InferenciaVar {
    public static void main(String[] args) {
        System.out.println("=== TEMA 5: INFERENCIA DE TIPOS CON VAR ===");
        
        
        var registros = new HashMap<String, List<Integer>>();
        
       
        registros.put("Notas_GrupoA", List.of(85, 90, 78));
        
        System.out.println("Contenido del mapa: " + registros);
        System.out.println("Tipo detectado: " + registros.getClass().getSimpleName());
    }
}