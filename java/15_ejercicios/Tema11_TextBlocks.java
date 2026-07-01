public class Tema11_TextBlocks {
    public static void main(String[] args) {
        System.out.println("=== TEMA 11: TEXT BLOCKS ===");
        
        
        String jsonFormat = """
        {
            "proyecto": "ElectoYa",
            "tipo": "Aplicativo Web",
            "estado": "En Desarrollo"
        }
        """;
        
        System.out.println("Formato JSON impreso limpiamente:");
        System.out.println(jsonFormat);
    }
}