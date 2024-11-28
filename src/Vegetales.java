import java.util.Scanner;

public class Vegetales extends Plantas{
    String vitaminas;
    String tipo;

    public Vegetales() {
    }

    public Vegetales(String nombre, String especie, String color, String vitaminas, String tipo) {
        super(nombre, especie, color);
        this.vitaminas = vitaminas;
        this.tipo = tipo;
    }

    public String getVitaminas() {
        return vitaminas;
    }

    public void setVitaminas(String vitaminas) {
        this.vitaminas = vitaminas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void mostrarPlantas() {
        super.mostrarPlantas();
        System.out.println("Nutrientes: " + this.getVitaminas());
        System.out.println("Tipo de crecimiento: " + this.getTipo());
    }

    @Override
    public void ingresarPlantas() {
        super.ingresarPlantas();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los nutrientes o vitaminas que aporta el vegetal: ");
        this.vitaminas = sc.nextLine();
        System.out.println("Ingrese el tipo de crecimiento del vegetal: ");
        this.tipo = sc.nextLine();
    }
}
