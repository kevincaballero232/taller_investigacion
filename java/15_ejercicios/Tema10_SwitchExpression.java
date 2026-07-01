public class Tema10_SwitchExpression {
    public static void main(String[] args) {
        System.out.println("=== TEMA 10: SWITCH EXPRESSION ===");
        
        int dia = 7;
        
       
        String tipoDia = switch (dia) {
            case 1, 7 -> "Fin de semana";
            case 2, 3, 4, 5, 6 -> "Día laboral";
            default -> "Día inválido";
        };
        
        System.out.println("El día " + dia + " es: " + tipoDia);
    }
}