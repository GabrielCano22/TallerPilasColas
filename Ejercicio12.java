import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio12 {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la dimensión de la matriz cuadrada (n): ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        Queue<Integer> colaPares = new LinkedList<>();
        Queue<Integer> colaImpares = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    colaPares.add(matriz[i][j]);
                } else {
                    colaImpares.add(matriz[i][j]);
                }
            }
        }

        System.out.println("Elementos en posiciones pares:");
        while (!colaPares.isEmpty()) {
            System.out.println(colaPares.poll());
        }

        System.out.println("Elementos en posiciones impares:");
        while (!colaImpares.isEmpty()) {
            System.out.println(colaImpares.poll());
        }
    }
}