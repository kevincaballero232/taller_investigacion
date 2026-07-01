public class Tema2_AsignacionCompuesta {
    public static void main(String[] args) {
        System.out.println("=== TEMA 2: OPERADORES DE ASIGNACIÓN COMPUESTA ===");
        
        double total = 100.0;
        int contador = 10;
        int factor = 5;

        total += 50.0;   
        contador -= 1;   
        factor *= 2;     

        System.out.println("Total acumulado (+=): " + total);
        System.out.println("Contador reducido (-=): " + contador);
        System.out.println("Factor multiplicado (*=): " + factor);
    }
}