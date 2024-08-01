import java.util.*;

public class GenerarAleatorio {
    public static void main(String[] args) {
        int contador_par = 0, contador_impar = 0;
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Integer> vector = new ArrayList<Integer>();
        System.out.print("Ingrese cantidad de numeros: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            vector.add(rand.nextInt(100));
        }

        System.out.println("Vector aleatorio: ");

        for (Integer integer : vector) {
            System.out.print(integer + " ");
            if (integer % 2 == 0) {
                contador_par++;
            } else {
                contador_impar++;
            }
        }

        System.out.println("\nCantidad de elementos pares: " + contador_par);

        System.out.println("Cantidad de elementos impares: " + contador_impar);
        scanner.close();
    }
}
