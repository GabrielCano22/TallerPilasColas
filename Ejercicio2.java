import java.util.Scanner;
import java.util.Stack;

public class Ejercicio2 {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena = sc.nextLine();
        
        invertir(cadena);
    }

    public void invertir(String cadena) {
        Stack<Character> pila = new Stack<>();
        for (char c : cadena.toCharArray()) {
            pila.push(c);
        }

        StringBuilder cadenaInvertida = new StringBuilder();
        while (!pila.isEmpty()) {
            cadenaInvertida.append(pila.pop());
        }

        System.out.println("Cadena invertida: " + cadenaInvertida.toString());
        System.out.println("Número de caracteres: " + cadena.length());
    }
}