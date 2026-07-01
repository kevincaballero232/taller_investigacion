import java.io.BufferedReader; // <-- ¡Faltaba este import vital!
import java.io.StringReader;
import java.io.IOException;

public class Tema16_TryWithResources { 
    public static void main(String[] args) {
        System.out.println("=== TEMA 16: TRY-WITH-RESOURCES ===");

        // Simulamos la lectura de un flujo de datos
        String datosSimulados = "Configuración Base de Datos\nHost: localhost\nPuerto: 3306";

        // El recurso se declara dentro del try () y se cierra automáticamente
        try (BufferedReader br = new BufferedReader(new StringReader(datosSimulados))) {
            String linea;
            System.out.println("Leyendo el flujo de configuración:");
            while ((linea = br.readLine()) != null) {
                System.out.println(" -> " + linea);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al procesar el flujo: " + e.getMessage());
        }
    }
}