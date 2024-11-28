import java.util.Scanner;
import java.util.Stack;

public class Ejercicio7 {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();

        System.out.print("Ingrese el número de elementos en la pila: ");
        int n = sc.nextInt();

        System.out.println("Ingrese los elementos de la pila:");
        for (int i = 0; i < n; i++) {
            pila.push(sc.nextInt());
        }

        int cantidadEntre20y80 = 0;
        int cantidadPositivos = 0;
        int sumaEntre80y200 = 0;

        Stack<Integer> pilaAux = new Stack<>();
        while (!pila.isEmpty()) {
            int num = pila.pop();
            if (num < 0) {
                num = (int) Math.pow(num, 3);
            }
            if (num >= 20 && num <= 80) {
                cantidadEntre20y80++;
            }
            if (num > 0) {
                cantidadPositivos++;
            }
            if (num >= 80 && num <= 200) {
                sumaEntre80y200 += num;
            }
            pilaAux.push(num);
        }

        while (!pilaAux.isEmpty()) {
            pila.push(pilaAux.pop());
        }

        System.out.println("Cantidad de números comprendidos entre 20 y 80: " + cantidadEntre20y80);
        System.out.println("Cantidad de números positivos: " + cantidadPositivos);
        System.out.println("Suma de los números comprendidos entre 80 y 200: " + sumaEntre80y200);
    }
}