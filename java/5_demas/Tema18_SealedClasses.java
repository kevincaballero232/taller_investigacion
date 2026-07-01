public class Tema18_SealedClasses {

    // Definición de una interfaz sellada que solo permite ser implementada por dos clases específicas
    public sealed interface EstadoVotacion permits Activa, Finalizada { }

    // Clases permitidas (deben ser finales, selladas o no-selladas)
    public static final class Activa implements EstadoVotacion {
        public String obtenerMensaje() { return "Las votaciones están abiertas actualmente."; }
    }

    public static final class Finalizada implements EstadoVotacion {
        public String obtenerMensaje() { return "El proceso electoral ha concluido."; }
    }

    public static void main(String[] args) {
        System.out.println("=== TEMA 23: CLASES SELLADAS (SEALED CLASSES) ===");

        // Instanciación controlada dentro de la jerarquía cerrada
        EstadoVotacion estadoActual = new Activa();

        if (estadoActual instanceof Activa control) {
            System.out.println("Estado del sistema: " + control.obtenerMensaje());
        }
    }
}