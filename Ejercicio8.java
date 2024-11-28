import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio8 {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la dimensión de las matrices (n): ");
        int n = sc.nextInt();

        int[][] matrizA = new int[n][n];
        int[][] matrizB = new int[n][n];

        System.out.println("Ingrese los elementos de la matriz A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Ingrese los elementos de la matriz B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizB[i][j] = sc.nextInt();
            }
        }

        Queue<Integer> cola = new LinkedList<>();

        // Multiplicación de matriz A * matriz B
        int[][] resultadoMultiplicacion = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    resultadoMultiplicacion[i][j] += matrizA[i][k] * matrizB[k][j];
                }
                cola.add(resultadoMultiplicacion[i][j]);
            }
        }

        System.out.println("Resultado de la multiplicación de matrices en la cola:");
        for (int num : cola) {
            System.out.println(num);
        }

        // Media de la matriz A y matriz B
        double sumaA = 0, sumaB = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumaA += matrizA[i][j];
                sumaB += matrizB[i][j];
            }
        }
        double mediaA = sumaA / (n * n);
        double mediaB = sumaB / (n * n);

        System.out.println("Media de la matriz A: " + mediaA);
        System.out.println("Media de la matriz B: " + mediaB);
        System.out.println("La mayor media es: " + (mediaA > mediaB ? "Matriz A" : "Matriz B"));

        // Factorial de la media de la matriz A y matriz B
        long factorialMediaA = factorial((int) mediaA);
        long factorialMediaB = factorial((int) mediaB);

        System.out.println("Factorial de la media de la matriz A: " + factorialMediaA);
        System.out.println("Factorial de la media de la matriz B: " + factorialMediaB);

        // Evaluar y cambiar números negativos por 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrizA[i][j] < 0) {
                    matrizA[i][j] = 0;
                }
                if (matrizB[i][j] < 0) {
                    matrizB[i][j] = 0;
                }
            }
        }

        System.out.println("Matriz A después de cambiar números negativos por 0:");
        imprimirMatriz(matrizA);

        System.out.println("Matriz B después de cambiar números negativos por 0:");
        imprimirMatriz(matrizB);
    }

    public long factorial(int num) {
        if (num == 0) return 1;
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}