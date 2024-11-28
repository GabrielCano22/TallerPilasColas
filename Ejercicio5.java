import java.util.Scanner;
import java.util.Stack;

public class Ejercicio5 {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        Stack<Long> pila = new Stack<>();

        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();
        int[] vector = new int[n];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = sc.nextInt();
        }

        for (int num : vector) {
            pila.push(factorial(num));
        }

        System.out.println("Factoriales de los elementos del vector en la pila:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }

    public long factorial(int num) {
        if (num == 0) return 1;
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}