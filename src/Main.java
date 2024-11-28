public class Main {
    public static void main(String[] args) {
        Recetas receta1 = new Recetas("Zanahoria", "", "Naranja", "C, D, Zinc", "Tierra", "Humeda", 30, "Ensalada", "Hervida");
        Recetas receta2 = new Recetas("Papa", "", "Cafe", "Carbohidratos", "Tierra", "Arida", 25, "Salchipapa", "Frita");
        Recetas receta3 = new Recetas();
        System.out.println("En esta aplicacion vamos a hablar de vegetales que pueden ser usado en recetas, te voy a dar dos ejemplos y tu tendras que agregar uno mas:");
        System.out.println("-------1-------");
        receta1.mostrarPlantas();
        System.out.println("-------2-------");
        receta2.mostrarPlantas();

        try {
            System.out.println("Teniendo en cuenta los ejemplos, a continuacion debes colocar algun vegetal de manera similar, ten en cuenta que por ahora estamos hablando de vegetales que crecen en la tierra.");
            receta3.ingresarPlantas();
            System.out.println("-------3-------");
            receta3.mostrarPlantas();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}