import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio16 {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();

        System.out.print("Ingrese el número de elementos en la pila: ");
        int n = sc.nextInt();

        System.out.println("Ingrese los elementos de la pila:");
        for (int i = 0; i < n; i++) {
            pila.push(sc.nextInt());
        }

        int opcion;
        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Mostrar la factorial de cada elemento de la cola");
            System.out.println("2. Mostrar los números ordenados de mayor a menor de la cola");
            System.out.println("3. Mostrar la serie Fibonacci de cada elemento de la cola");
            System.out.println("4. Mostrar la raíz cuadrada de cada elemento de la cola");
            System.out.println("5. Multiplicar por el cubo si el elemento es negativo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    mostrarFactorial(pila);
                    break;
                case 2:
                    mostrarOrdenados(pila);
                    break;
                case 3:
                    mostrarFibonacci(pila);
                    break;
                case 4:
                    mostrarRaizCuadrada(pila);
                    break;
                case 5:
                    multiplicarPorCuboSiNegativo(pila);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    public static void mostrarFactorial(Stack<Integer> pila) {
        Queue<Long> cola = new LinkedList<>();
        for (int num : pila) {
            cola.add(factorial(num));
        }
        System.out.println("Factorial de cada elemento de la cola:");
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }

    public static long factorial(int num) {
        if (num == 0) return 1;
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void mostrarOrdenados(Stack<Integer> pila) {
        Queue<Integer> cola = new LinkedList<>(pila);
        LinkedList<Integer> lista = new LinkedList<>(cola);
        lista.sort((a, b) -> b - a);
        System.out.println("Números ordenados de mayor a menor de la cola:");
        for (int num : lista) {
            System.out.println(num);
        }
    }

    public static void mostrarFibonacci(Stack<Integer> pila) {
        Queue<Long> cola = new LinkedList<>();
        for (int num : pila) {
            cola.add(fibonacci(num));
        }
        System.out.println("Serie Fibonacci de cada elemento de la cola:");
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }

    public static long fibonacci(int num) {
        if (num <= 1) return num;
        long a = 0, b = 1;
        for (int i = 2; i <= num; i++) {
            long temp = a;
            a = b;
            b = temp + b;
        }
        return b;
    }

    public static void mostrarRaizCuadrada(Stack<Integer> pila) {
        Queue<Double> cola = new LinkedList<>();
        for (int num : pila) {
            cola.add(Math.sqrt(num));
        }
        System.out.println("Raíz cuadrada de cada elemento de la cola:");
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }

    public static void multiplicarPorCuboSiNegativo(Stack<Integer> pila) {
        Queue<Integer> cola = new LinkedList<>();
        for (int num : pila) {
            if (num < 0) {
                cola.add(num * num * num);
            } else {
                cola.add(num);
            }
        }
        System.out.println("Elementos después de multiplicar por el cubo si son negativos:");
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }
}