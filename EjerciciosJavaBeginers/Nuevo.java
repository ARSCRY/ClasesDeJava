import java.util.Scanner;

public class Nuevo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el numero: ");

        int numero = scanner.nextInt();
       
        int i=0;
        while (i<=numero) {
            int j=numero;
            while (j>=0) {
                System.out.println(i + " + " + j + " = " + (i + j));
                i++;
                j--;
            }
        }
        scanner.close();
    }
}
