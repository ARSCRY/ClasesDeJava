import java.util.*;

public class CodigoPrimo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un numero entero mayor a 0:");

        int numero = scanner.nextInt();

        int contador = 0;
        System.out.println("Divisores de " + numero + " : ");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        if (contador == 1) {
            System.out.println("El numero " + numero + " es simple.");
        }
        if (contador == 2) {
            System.out.println("El numero " + numero + " es primo.");
        } else {
            System.out.println("El numero " + numero + " no es primo.");
        }
        scanner.close();
    }
}
