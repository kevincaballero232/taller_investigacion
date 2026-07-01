public class Tema17_MultiCatch {
    public static void main(String[] args) {
        System.out.println("=== TEMA 17: MULTI-CATCH (MÚLTIPLES EXCEPCIONES) ===");

        procesarEntradaControlada("texto_invalido");
        procesarEntradaControlada(null);
    }

    public static void procesarEntradaControlada(String entrada) {
        try {
            
            int numeroConvertido = Integer.parseInt(entrada.strip());
            System.out.println("Número procesado con éxito: " + numeroConvertido);

        } catch (NumberFormatException | NullPointerException e) {
           
            System.out.println("Error de ejecución detectado: Entrada inválida para la conversión numérica.");
            System.out.println("Detalle técnico: " + e.toString());
        }
    }
}