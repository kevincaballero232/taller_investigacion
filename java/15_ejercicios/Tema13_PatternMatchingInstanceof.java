public class Tema13_PatternMatchingInstanceof {
    public static void main(String[] args) {
        System.out.println("=== TEMA 13: PATTERN MATCHING CON INSTANCEOF ===");
        
        Object objetoPrueba = "Hola, esto es una cadena de texto para el taller";
        
        if (objetoPrueba instanceof String texto) {
            System.out.println("El objeto es un String.");
            System.out.println("Longitud del texto: " + texto.length());
        } else {
            System.out.println("El objeto no es un String.");
        }
    }
}