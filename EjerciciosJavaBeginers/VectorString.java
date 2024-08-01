
/**
 * VectorString
 */
import java.util.*;

public class VectorString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] estudiante = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Estudiante [" + (i + 1) + "]-->");
            estudiante[i] = scanner.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Estudiante " + (i + 1) + "-->"+estudiante[i]);
        }
        scanner.close();
    }
}