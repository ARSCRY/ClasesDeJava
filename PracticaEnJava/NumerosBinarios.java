import java.util.*;

public class NumerosBinarios {

    static void conversorBinario(int n) {
        int[] arrayBinario = new int[1000];

        int i = 0;
        while (n > 0) {
            arrayBinario[i] = n % 2;
            n = n / 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(arrayBinario[j]);
        }
    }

    public static void main(String[] args) {

        System.out.println("Ingresar numero: ");
        Scanner scanner = new Scanner(System.in);

        Integer numero = scanner.nextInt();
        System.out.println("Decimal ->" + numero);
        System.out.println("Binario ->");conversorBinario(numero);

        scanner.close();
    }
}
