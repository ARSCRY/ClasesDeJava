import java.util.Scanner;

public class VectorBasico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cantidad de valores del vector: ");
        int longitud = scanner.nextInt();
        
        int[] vector = new int[longitud];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento [" + i + "]-->");
            vector[i] = scanner.nextInt();
        }

        System.out.println("Vector generado: ");

        for (int i : vector) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
