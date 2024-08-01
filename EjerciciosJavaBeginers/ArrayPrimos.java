import java.util.*;

public class ArrayPrimos {
    public static void main(String[] args) {
        ArrayList<Integer> primos = new ArrayList<Integer>();
        System.out.println("Ingrese la cantidad en el arreglo: ");
        Scanner scanner = new Scanner(System.in);
        int cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Elemento " + i + " :");
            int arreglo = scanner.nextInt();
            primos.add(arreglo);
        }

        System.out.println("Arreglo: ");
        for (Integer integer : primos) {
            System.out.print(integer + " ");
        }
        System.out.println();// Salto de linea
        int cont = 0;
        for (Integer primo : primos) {
            for (int j = 1; j <= primo; j++) {
                if (primo % j == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                System.out.println("Numero primo: " + primo);
            } else if (cont > 2) {
                System.out.println("Numero compuesto: " + primo);
            } else {
                System.out.println("Numero simple: " + primo);
            }
        }
        scanner.close();
    }
}
