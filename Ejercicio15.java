import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio15 {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        Queue<Material> colaMateriales = new LinkedList<>();

        System.out.print("Ingrese el número de materiales recibidos: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del material " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese la cantidad en toneladas del material " + (i + 1) + ": ");
            int cantidad = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea

            colaMateriales.add(new Material(nombre, cantidad));
        }

        Material materialMayorIngreso = null;
        int maxCantidad = 0;

        for (Material material : colaMateriales) {
            if (material.cantidad > maxCantidad) {
                maxCantidad = material.cantidad;
                materialMayorIngreso = material;
            }
        }

        System.out.println("Materiales ingresados:");
        for (Material material : colaMateriales) {
            System.out.println(material.nombre + ": " + material.cantidad + " toneladas");
        }

        if (materialMayorIngreso != null) {
            System.out.println("El material con mayor ingreso es: " + materialMayorIngreso.nombre + " con " + materialMayorIngreso.cantidad + " toneladas.");
        }
    }
}