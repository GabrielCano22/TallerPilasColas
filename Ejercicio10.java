import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio10 {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        Queue<Double> salarios = new LinkedList<>();

        System.out.print("Ingrese el número de empleados: ");
        int n = sc.nextInt();

        int[] horasTrabajadas = new int[n];
        double[] valorHora = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese las horas trabajadas por el empleado " + (i + 1) + ": ");
            horasTrabajadas[i] = sc.nextInt();
            System.out.print("Ingrese el valor de la hora del empleado " + (i + 1) + ": ");
            valorHora[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            double salario = calcularSalario(horasTrabajadas[i], valorHora[i]);
            salarios.add(salario);
        }

        System.out.println("Salarios de los empleados:");
        int empleado = 1;
        while (!salarios.isEmpty()) {
            System.out.println("El salario del empleado " + empleado + " es: " + salarios.poll());
            empleado++;
        }
    }

    public static double calcularSalario(int horasTrabajadas, double valorHora) {
        int horasNormales = Math.min(horasTrabajadas, 40);
        int horasExtras = Math.max(horasTrabajadas - 40, 0);
        int horasExtrasDobles = Math.min(horasExtras, 8);
        int horasExtrasTriples = Math.max(horasExtras - 8, 0);

        double salario = horasNormales * valorHora;
        salario += horasExtrasDobles * valorHora * 2;
        salario += horasExtrasTriples * valorHora * 3;

        return salario;
    }
}