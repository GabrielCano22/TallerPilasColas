import java.util.Scanner;
import java.util.Stack;

public class Ejercicio4 {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        Stack<Character> pila = new Stack<>();

        while (true) {
            System.out.print("Ingrese el número de elementos en la pila: ");
            int n = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea

            System.out.println("Ingrese los elementos de la pila:");
            for (int i = 0; i < n; i++) {
                pila.push(sc.nextLine().charAt(0));
            }

            System.out.print("Ingrese el carácter o número a buscar: ");
            char buscar = sc.nextLine().charAt(0);

            int posicion = buscarEnPila(pila, buscar);
            if (posicion != -1) {
                System.out.println("El carácter '" + buscar + "' se encontró en la posición: " + posicion);
                break;
            } else {
                System.out.println("El carácter '" + buscar + "' no se encontró en la pila.");
                if (pila.isEmpty()) {
                    System.out.println("La pila está vacía. Volviendo a llenar la pila...");
                }
            }
        }
    }

    public int buscarEnPila(Stack<Character> pila, char buscar) {
        Stack<Character> pilaAux = new Stack<>();
        int posicion = -1;
        int contador = 0;

        while (!pila.isEmpty()) {
            char elemento = pila.pop();
            pilaAux.push(elemento);
            contador++;
            if (elemento == buscar) {
                posicion = contador;
                break;
            }
        }

        while (!pilaAux.isEmpty()) {
            pila.push(pilaAux.pop());
        }

        return posicion;
    }
}