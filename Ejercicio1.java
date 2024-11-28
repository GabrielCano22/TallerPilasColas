import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio1 {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la dimensión de la matriz (n): ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int option;
        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Método pila con la suma de las filas de la matriz");
            System.out.println("2. Método cola con la suma de las columnas de la matriz");
            System.out.println("3. Factorial de la dimensión de la matriz");
            System.out.println("4. Método cola donde muestre los números ordenados de mayor a menor de la cola");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    sumaFilasPila(matriz, n);
                    break;
                case 2:
                    sumaColumnasCola(matriz, n);
                    break;
                case 3:
                    System.out.println("Factorial de " + n + " es: " + factorial(n));
                    break;
                case 4:
                    mostrarNumerosOrdenadosCola(matriz, n);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (option != 0);
    }

    public static void sumaFilasPila(int[][] matriz, int n) {
        Stack<Integer> pila = new Stack<>();
        for (int i = 0; i < n; i++) {
            int suma = 0;
            for (int j = 0; j < n; j++) {
                suma += matriz[i][j];
            }
            pila.push(suma);
        }
        System.out.println("Suma de las filas (usando pila): " + pila);
    }

    public static void sumaColumnasCola(int[][] matriz, int n) {
        Queue<Integer> cola = new LinkedList<>();
        for (int j = 0; j < n; j++) {
            int suma = 0;
            for (int i = 0; i < n; i++) {
                suma += matriz[i][j];
            }
            cola.add(suma);
        }
        System.out.println("Suma de las columnas (usando cola): " + cola);
    }

    public static long factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void mostrarNumerosOrdenadosCola(int[][] matriz, int n) {
        Queue<Integer> cola = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cola.add(matriz[i][j]);
            }
        }
        LinkedList<Integer> lista = new LinkedList<>(cola);
        lista.sort((a, b) -> b - a);
        System.out.println("Números ordenados de mayor a menor (usando cola): " + lista);
    }
}