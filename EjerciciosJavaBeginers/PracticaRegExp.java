import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PracticaRegExp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite una palabra: ");
        String palabra = scanner.nextLine();

        System.out.println("Ingrese una oracion: ");
        String frase = scanner.nextLine();

        Pattern pattern = Pattern.compile(palabra, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(frase);
        boolean palabraEncontrada = matcher.find();

        if (palabraEncontrada) {
            System.out.println("La palabra" + palabra + " esta en la frase que ha escrito");
        } else {
            System.out.println("La palabra "+ palabra +" no esta en la frase que ha escrito");
        }
        scanner.close();
    }
}
