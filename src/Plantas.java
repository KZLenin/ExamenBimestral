import java.util.Scanner;

public class Plantas {
    String nombre;
    String especie;
    String color;

    public Plantas() {
    }

    public Plantas(String nombre, String especie, String color) {
        this.nombre = nombre;
        this.especie = especie;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mostrarPlantas() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Color: " + color);
    }

    public void ingresarPlantas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la planta: ");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese el especie de la planta: ");
        this.especie = sc.nextLine();
        System.out.println("Ingrese el color de la planta: ");
        this.color = sc.nextLine();
    }
}
