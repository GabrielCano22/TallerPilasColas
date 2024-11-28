import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio13 {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de filas (n): ");
        int n = sc.nextInt();
        System.out.print("Ingrese el número de columnas (m): ");
        int m = sc.nextInt();

        int[][] matriz = new int[n][m];
        Stack<Integer> pila = new Stack<>();

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Ingrese los elementos de la pila:");
        for (int i = 0; i < n; i++) {
            pila.push(sc.nextInt());
        }

        double promedioAntes = calcularPromedio(pila);
        System.out.println("Promedio de la pila antes de los cambios: " + promedioAntes);

        Queue<Integer> colaResultados = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int valorPila = pila.get(i);
            for (int j = 0; j < m; j++) {
                int resultado = valorPila * matriz[i][j];
                if (resultado > 1000) {
                    resultado = 1000;
                } else if (resultado > 490 && resultado < 500) {
                    resultado = 500;
                }
                colaResultados.add(resultado);
            }
        }

        double promedioDespues = calcularPromedio(colaResultados);
        System.out.println("Promedio de la cola después de los cambios: " + promedioDespues);

        System.out.println("Resultados en la cola:");
        while (!colaResultados.isEmpty()) {
            System.out.println(colaResultados.poll());
        }
    }

    public static double calcularPromedio(Stack<Integer> pila) {
        int suma = 0;
        for (int valor : pila) {
            suma += valor;
        }
        return (double) suma / pila.size();
    }

    public static double calcularPromedio(Queue<Integer> cola) {
        int suma = 0;
        int count = 0;
        for (int valor : cola) {
            suma += valor;
            count++;
        }
        return (double) suma / count;
    }
}