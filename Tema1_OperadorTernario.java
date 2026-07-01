public class Tema1_OperadorTernario {
    public static void main(String[] args) {
        System.out.println("=== TEMA 1: OPERADOR TERNARIO ===");
        
        int edad = 20;

        // Sintaxis abreviada moderna
        String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        
        System.out.println("Edad: " + edad);
        System.out.println("Resultado: " + mensaje);
    }
}