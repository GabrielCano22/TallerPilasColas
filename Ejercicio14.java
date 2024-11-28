import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio14 {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila1 = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();
        Stack<Integer> pila3 = new Stack<>();

        System.out.print("Ingrese el número de elementos en las pilas: ");
        int n = sc.nextInt();

        System.out.println("Ingrese los elementos de la primera pila:");
        for (int i = 0; i < n; i++) {
            pila1.push(sc.nextInt());
        }

        System.out.println("Ingrese los elementos de la segunda pila:");
        for (int i = 0; i < n; i++) {
            pila2.push(sc.nextInt());
        }

        System.out.println("Ingrese los elementos de la tercera pila:");
        for (int i = 0; i < n; i++) {
            pila3.push(sc.nextInt());
        }

        Queue<Integer> cola = new LinkedList<>();

        agregarPilaACola(pila1, cola);
        agregarPilaACola(pila2, cola);
        agregarPilaACola(pila3, cola);

        System.out.println("Cola con los números de las pilas ingresadas (sin duplicados):");
        for (int num : cola) {
            System.out.println(num);
        }

        int sumaPila1 = calcularSuma(pila1);
        int sumaPila2 = calcularSuma(pila2);
        int sumaPila3 = calcularSuma(pila3);

        Stack<Integer> pilaMayor = pila1;
        Stack<Integer> pilaMenor = pila1;

        if (sumaPila2 > sumaPila1 && sumaPila2 > sumaPila3) {
            pilaMayor = pila2;
        } else if (sumaPila3 > sumaPila1 && sumaPila3 > sumaPila2) {
            pilaMayor = pila3;
        }

        if (sumaPila2 < sumaPila1 && sumaPila2 < sumaPila3) {
            pilaMenor = pila2;
        } else if (sumaPila3 < sumaPila1 && sumaPila3 < sumaPila2) {
            pilaMenor = pila3;
        }

        Queue<Integer> colaMayor = new LinkedList<>(pilaMayor);
        Queue<Integer> colaMenor = new LinkedList<>(pilaMenor);

        System.out.println("Cola con la pila de suma mayor:");
        for (int num : colaMayor) {
            System.out.println(num);
        }

        System.out.println("Cola con la pila de suma menor:");
        for (int num : colaMenor) {
            System.out.println(num);
        }
    }

    public static void agregarPilaACola(Stack<Integer> pila, Queue<Integer> cola) {
        for (int num : pila) {
            if (!cola.contains(num)) {
                cola.add(num);
            }
        }
    }

    public static int calcularSuma(Stack<Integer> pila) {
        int suma = 0;
        for (int num : pila) {
            suma += num;
        }
        return suma;
    }
}