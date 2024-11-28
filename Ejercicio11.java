import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio11 {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        Stack<String> pilaSiniestros = new Stack<>();
        Queue<String> colaSiniestros = new LinkedList<>();

        System.out.println("Ingrese los siniestros presentados en el año (escriba 'fin' para terminar):");
        while (true) {
            String siniestro = sc.nextLine();
            if (siniestro.equalsIgnoreCase("fin")) {
                break;
            }
            pilaSiniestros.push(siniestro);
        }

        while (!pilaSiniestros.isEmpty()) {
            colaSiniestros.add(pilaSiniestros.pop());
        }

        System.out.println("Siniestros ingresados en la cola:");
        for (String siniestro : colaSiniestros) {
            System.out.println(siniestro);
        }

        String siniestroMayorIngreso = null;
        int maxConteo = 0;
        for (String siniestro : colaSiniestros) {
            int conteo = 0;
            for (String s : colaSiniestros) {
                if (s.equals(siniestro)) {
                    conteo++;
                }
            }
            if (conteo > maxConteo) {
                maxConteo = conteo;
                siniestroMayorIngreso = siniestro;
            }
        }

        System.out.println("El siniestro con mayor ingreso es: " + siniestroMayorIngreso + " con " + maxConteo + " ingresos.");
    }
}