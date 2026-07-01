public class Tema19_PatternMatchingSwitch {
    public static void main(String[] args) {
        System.out.println("=== TEMA 19: PATTERN MATCHING PARA SWITCH ===");

        // Evaluamos diferentes tipos de objetos dinámicamente en el switch moderno
        System.out.println(evaluarTipoObjeto("Texto de prueba"));
        System.out.println(evaluarTipoObjeto(2026));
        System.out.println(evaluarTipoObjeto(null));
    }

    public static String evaluarTipoObjeto(Object obj) {
        // Evalúa el tipo de dato directamente en las etiquetas del case (Requiere Java 21+)
        return switch (obj) {
            case Integer i -> "El objeto es un número Entero: " + i;
            case String s -> "El objeto es un Texto con longitud de " + s.length() + " caracteres.";
            case null -> "El objeto recibido es Nulo (Null safely checked).";
            default -> "Tipo de objeto desconocido o no mapeado.";
        };
    }
}