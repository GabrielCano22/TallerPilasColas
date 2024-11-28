import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 16) {
            System.out.println("MENU PRINCIPAL:");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("9. Ejercicio 9");
            System.out.println("10. Ejercicio 10");
            System.out.println("11. Ejercicio 11");
            System.out.println("12. Ejercicio 12");
            System.out.println("13. Ejercicio 13");
            System.out.println("14. Ejercicio 14");
            System.out.println("15. Ejercicio 15");
            System.out.println("16. Ejercicio 16");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    new Ejercicio1().ejecutar();
                    break;
                case 2:
                    new Ejercicio2().ejecutar();
                    break;
                case 3:
                    new Ejercicio3().ejecutar();
                    break;
                case 4:
                    new Ejercicio4().ejecutar();
                    break;
                case 5:
                    new Ejercicio5().ejecutar();
                    break;
                case 6:
                    new Ejercicio6().ejecutar();
                    break;
                case 7:
                    new Ejercicio7().ejecutar();
                    break;
                case 8:
                    new Ejercicio8().ejecutar();
                    break;
                case 9:
                    new Ejercicio9().ejecutar();
                    break;
                case 10:
                    new Ejercicio10().ejecutar();
                    break;
                case 11:
                    new Ejercicio11().ejecutar();
                    break;
                case 12:
                    new Ejercicio12().ejecutar();
                    break;
                case 13:
                    new Ejercicio13().ejecutar();
                    break;
                case 14:
                    new Ejercicio14().ejecutar();
                    break;
                case 15:
                    new Ejercicio15().ejecutar();
                    break;
                case 16:
                    new Ejercicio16().ejecutar();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}