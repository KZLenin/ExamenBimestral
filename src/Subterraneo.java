import java.util.Scanner;

public class Subterraneo extends Vegetales {
    String tipoTierra;
    double profundidad;

    public Subterraneo() {
    }

    public Subterraneo(String nombre, String especie, String color, String vitaminas, String tipo, String tipoTierra, double profundidad) {
        super(nombre, especie, color, vitaminas, tipo);
        this.tipoTierra = tipoTierra;
        this.profundidad = profundidad;
    }

    public String getTipoTierra() {
        return tipoTierra;
    }

    public void setTipoTierra(String tipoTierra) {
        this.tipoTierra = tipoTierra;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    @Override
    public void mostrarPlantas(){
        super.mostrarPlantas();
        System.out.println("Tipo de Tierra: " + tipoTierra);
        System.out.println("Profundidad: " + profundidad +"cm");
    }

    @Override
    public void ingresarPlantas(){
        super.ingresarPlantas();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de tierra: ");
        this.tipoTierra = sc.nextLine();
        System.out.println("Ingrese el profundidad a la que crece el vegetal: ");
        this.profundidad = sc.nextDouble();
    }
}
