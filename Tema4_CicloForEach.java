import java.util.List;

public class Tema4_CicloForEach {
    public static void main(String[] args) {
        System.out.println("=== TEMA 4: CICLO FOR-EACH ===");
        
        List<String> nombres = List.of("Ana", "Luis", "Marta");
        
        // Recorrido limpio utilizando for-each
        for (String nombre : nombres) {
            System.out.println("Nombre en la lista: " + nombre);
        }
    }
}