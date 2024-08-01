import java.util.Scanner;

public class Calculadora2 {

    public void Sumar(int a, int b) {
        System.out.println("Suma: " + (a + b));
    }

    public void Restar(int a, int b) {
        System.out.println("Resta: " + (a - b));
    }

    public void Multiplicar(int a, int b) {
        System.out.println("Multiplicacion: " + (a * b));
    }

    public void Dividir(int a, int b) {
        try {
            System.out.println("Division: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error en el divisor");
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

        // Creacion de objeto
        Calculadora2 objeto = new Calculadora2();

        if (opcion == 'S' || opcion == 's') {
            objeto.Sumar(num, num2);
        } else if (opcion == 'R' || opcion == 'r') {
            objeto.Restar(num, num2);
        } else if (opcion == 'M' || opcion == 'm') {
            objeto.Multiplicar(num, num2);
        } else if (opcion == 'D' || opcion == 'd') {
            objeto.Dividir(num, num2);
        } else {
            System.out.println("Opcion no valida");
        }
        scanner.close();
    }
}
