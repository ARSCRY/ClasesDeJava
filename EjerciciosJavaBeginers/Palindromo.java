import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        System.out.println("Digite la frase: ");
        Scanner scanner = new Scanner(System.in);

        String frase = scanner.nextLine();

        String fraseReversa = "";

        frase = frase.toLowerCase();
        frase = frase.replaceAll(" ", "");

        for (int i = 0; i < frase.length(); i++) {
            fraseReversa = frase.charAt(i) + fraseReversa;
        }
        System.out.println("Frase en reversa: " + fraseReversa);

        if (fraseReversa.contentEquals(frase)) {
            System.out.println("La frase escrita es palindromo");
        } else {
            System.out.println("La frase no es palindromo");
        }
        scanner.close();
    }
}
