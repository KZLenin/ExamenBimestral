import java.util.Scanner;

public class Recetas extends Subterraneo {
    String platillo;
    String coccion;

    public Recetas() {
    }

    public Recetas(String nombre, String especie, String color, String vitaminas, String tipo, String tipoTierra, double profundidad, String platillo, String coccion) {
        super(nombre, especie, color, vitaminas, tipo, tipoTierra, profundidad);
        this.platillo = platillo;
        this.coccion = coccion;
    }

    public String getPlatillo() {
        return platillo;
    }

    public void setPlatillo(String platillo) {
        this.platillo = platillo;
    }

    public String getCoccion() {
        return coccion;
    }

    public void setCoccion(String coccion) {
        this.coccion = coccion;
    }
    @Override
    public void mostrarPlantas(){
        super.mostrarPlantas();
        System.out.println("Platillo: " + platillo);
        System.out.println("Coccion: " + coccion);
    }

    @Override
    public void ingresarPlantas(){
        super.ingresarPlantas();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el platillo en el que se uso el vegetal: ");
        this.platillo = sc.nextLine();
        System.out.println("Ingrese el tipo de coccion que se uso para el vegetal: ");
        this.coccion = sc.nextLine();
    }
}
