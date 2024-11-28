import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Ejercicio6 {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de filas (n): ");
        int n = sc.nextInt();
        System.out.print("Ingrese el número de columnas (m): ");
        int m = sc.nextInt();

        int[][] matriz = new int[n][m];

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        Stack<Double> pila = new Stack<>();

        // Suma de todas las filas y promedio
        for (int i = 0; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < m; j++) {
                sumaFila += matriz[i][j];
            }
            double promedioFila = (double) sumaFila / m;
            pila.push(promedioFila);
        }

        System.out.println("Promedio de las filas en la pila:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

        // Suma de las columnas y raíz cuadrada
        for (int j = 0; j < m; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < n; i++) {
                sumaColumna += matriz[i][j];
            }
            double raizCuadrada = Math.sqrt(sumaColumna);
            pila.push(raizCuadrada);
        }

        System.out.println("Raíz cuadrada de la suma de las columnas en la pila:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

        // Multiplicación de matriz a * matriz b
        System.out.println("Ingrese los elementos de la segunda matriz (debe ser de tamaño " + m + "x" + n + "):");
        int[][] matrizB = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrizB[i][j] = sc.nextInt();
            }
        }

        int[][] resultado = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    resultado[i][j] += matriz[i][k] * matrizB[k][j];
                }
                pila.push((double) resultado[i][j]);
            }
        }

        System.out.println("Resultado de la multiplicación de matrices en la pila:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }
}