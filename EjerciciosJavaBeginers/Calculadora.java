import java.util.*;

public class Calculadora {

    static void Sumar(int a, int b) {
        System.out.println("Suma: " + (a + b));
    }

    static void Restar(int a, int b) {
        System.out.println("Resta: " + (a - b));
    }

    static void Multiplicar(int a, int b) {
        System.out.println("Multiplicacion: " + (a * b));
    }

    static void Dividir(int a, int b) {
        try{
            System.out.println("Division: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error. No puede ser 0 el divisor");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero: ");
        int num = scanner.nextInt();

        System.out.println("Numero siguiente: ");
        int num2 = scanner.nextInt();

        System.out.println("Escoja Suma (S), Resta (R), Multiplicar (M) o Dividir (D): ");
        char opcion = scanner.next().charAt(0);

        if (opcion == 'S' || opcion == 's') {
            Sumar(num, num2);
        } else if (opcion == 'R' || opcion == 'r') {
            Restar(num, num2);
        } else if (opcion == 'M' || opcion == 'm') {
            Multiplicar(num, num2);
        } else if (opcion == 'D' || opcion == 'd') {
            Dividir(num, num2);
        } else {
            System.out.println("Opcion no valida");
        }
        scanner.close();
    }
}
