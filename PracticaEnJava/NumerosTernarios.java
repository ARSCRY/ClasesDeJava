import java.util.*;

public class NumerosTernarios {
    static void conversorTernario(int n) {
        int[] arrayTernario = new int[1000];
        int i = 0;

        while (n > 0) {
            arrayTernario[i] = n % 3;
            n = n / 3;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(arrayTernario[j]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar numero: ");
        Integer numero = scanner.nextInt();

        System.out.println("Numero -> " + numero);
        System.out.println("Numero ternario ->");
        conversorTernario(numero);

        scanner.close();
    }
}
