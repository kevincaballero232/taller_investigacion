import java.util.Optional;

public class Tema9_ClaseOptional {
    public static void main(String[] args) {
        System.out.println("=== TEMA 9: CLASE OPTIONAL ===");
        
       
        Optional<String> usuarioEncontrado = buscarUsuarioPorId(101);
        Optional<String> usuarioVacio = buscarUsuarioPorId(999);
        
        
        System.out.println("Resultado 1: " + usuarioEncontrado.map(String::toUpperCase).orElse("No encontrado"));
        System.out.println("Resultado 2: " + usuarioVacio.map(String::toUpperCase).orElse("No encontrado"));
    }

    public static Optional<String> buscarUsuarioPorId(int id) {
        if (id == 101) {
            return Optional.of("Joaquín");
        }
        return Optional.empty(); 
    }
}