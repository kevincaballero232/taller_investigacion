public class Tema20_NuevosMetodosString {
    public static void main(String[] args) {
        System.out.println("=== TEMA 20: NUEVOS MÉTODOS DE STRING ===");

        String cadenaEspacios = "   ";
        String textoConTabulacion = " \u2003 Texto Limpio \u2003 "; // Espacio Unicode largo
        String separador = "-";

        // 1. Uso de isBlank() - Evalúa si contiene texto real o solo espacios en blanco
        System.out.println("¿La cadena vacía está en blanco?: " + cadenaEspacios.isBlank()); // true

        // 2. Uso de strip() - Elimina espacios de forma segura incluyendo caracteres Unicode avanzados
        System.out.println("Texto antes de limpiar: '" + textoConTabulacion + "'");
        System.out.println("Texto después de strip(): '" + textoConTabulacion.strip() + "'");

        // 3. Uso de repeat() - Replica el string un número específico de veces sin bucles manuales
        System.out.println("Línea divisoria generada automáticamente:");
        System.out.println(separador.repeat(30));
    }
}