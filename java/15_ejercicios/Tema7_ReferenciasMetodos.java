import java.util.List;

public class Tema7_ReferenciasMetodos {
    public static void main(String[] args) {
        System.out.println("=== TEMA 7: REFERENCIAS A MÉTODOS ===");
        
        List<String> cursos = List.of("Java", "Bases de Datos", "PHP", "JavaScript");
        
       
        System.out.println("Lista de cursos en ejecución:");
        cursos.forEach(System.out::println);
    }
}