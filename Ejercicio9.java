import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio9 {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila1 = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();

        System.out.print("Ingrese el número de elementos en la primera pila: ");
        int n1 = sc.nextInt();
        System.out.println("Ingrese los elementos de la primera pila:");
        for (int i = 0; i < n1; i++) {
            pila1.push(sc.nextInt());
        }

        System.out.print("Ingrese el número de elementos en la segunda pila: ");
        int n2 = sc.nextInt();
        System.out.println("Ingrese los elementos de la segunda pila:");
        for (int i = 0; i < n2; i++) {
            pila2.push(sc.nextInt());
        }

        Queue<Integer> colaPares = new LinkedList<>();
        Queue<Integer> colaImpares = new LinkedList<>();

        procesarPila(pila1, colaPares, colaImpares);
        procesarPila(pila2, colaPares, colaImpares);

        System.out.println("Cola con números pares:");
        while (!colaPares.isEmpty()) {
            System.out.println(colaPares.poll());
        }

        System.out.println("Cola con números impares:");
        while (!colaImpares.isEmpty()) {
            System.out.println(colaImpares.poll());
        }
    }

    public void procesarPila(Stack<Integer> pila, Queue<Integer> colaPares, Queue<Integer> colaImpares) {
        while (!pila.isEmpty()) {
            int num = pila.pop();
            if (num % 2 == 0) {
                colaPares.add(num);
            } else {
                colaImpares.add(num);
            }
        }
    }
}