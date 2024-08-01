import java.util.*;

public class Sumas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el numero: ");

        int numero = scanner.nextInt();

        for (int i = 0; i <= numero; i++) {
            for (int j = numero; j >= 0; j--) {
                System.out.println(i + " + " + j + " = " + (i + j));
                i++;
            }
        }
        scanner.close();
    }

}
