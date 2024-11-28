import java.util.Scanner;
import java.util.Stack;

public class Ejercicio3 {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();

        System.out.print("Ingrese el número de elementos en la pila: ");
        int n = sc.nextInt();

        System.out.println("Ingrese los elementos de la pila:");
        for (int i = 0; i < n; i++) {
            pila.push(sc.nextInt());
        }

        validarYReemplazar(pila);
        calcularRaizCuadrada(pila);

        System.out.println("Pila después de las operaciones:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }

    public void validarYReemplazar(Stack<Integer> pila) {
        Stack<Integer> pilaAux = new Stack<>();
        while (!pila.isEmpty()) {
            int num = pila.pop();
            if (num < 0) {
                pilaAux.push(0);
            } else if (num >= 8 && num <= 20) {
                pilaAux.push(50);
            } else if (num > 60 && num < 62) {
                pilaAux.push(100);
            } else {
                pilaAux.push(num);
            }
        }
        while (!pilaAux.isEmpty()) {
            pila.push(pilaAux.pop());
        }
    }

    public void calcularRaizCuadrada(Stack<Integer> pila) {
        Stack<Double> pilaAux = new Stack<>();
        while (!pila.isEmpty()) {
            int num = pila.pop();
            pilaAux.push(Math.sqrt(num));
        }
        while (!pilaAux.isEmpty()) {
            pila.push(pilaAux.pop().intValue());
        }
    }
}