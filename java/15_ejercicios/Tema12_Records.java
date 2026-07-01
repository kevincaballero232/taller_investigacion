public class Tema12_Records {
    
    public record Punto(int x, int y) { }

    public static void main(String[] args) {
        System.out.println("=== TEMA 12: RECORDS ===");
        
        
        Punto coordenada = new Punto(10, 25);
        
        
        System.out.println("Coordenada X: " + coordenada.x());
        System.out.println("Coordenada Y: " + coordenada.y());
        System.out.println("Objeto completo (toString automático): " + coordenada);
    }
}