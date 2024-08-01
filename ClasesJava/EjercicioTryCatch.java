import java.util.Scanner;

public class EjercicioTryCatch {
    static int dividirNumerosEnteros(int a, int b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Divisor no puede ser cero");
            }
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de x: ");
        int x = scanner.nextInt();

        System.out.println("Ingrese el valor de y: ");
        int y = scanner.nextInt();

        int resultado = dividirNumerosEnteros(x, y);
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}