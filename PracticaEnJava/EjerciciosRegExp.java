import java.util.regex.Pattern;

import java.util.regex.Matcher;

public class EjerciciosRegExp {
    public static void main(String[] args) {
        Pattern frase = Pattern.compile("Reconocer", Pattern.CASE_INSENSITIVE);
        Matcher matcher = frase.matcher("RECONOCER la frase");
        boolean matchEncontrado = matcher.find();

        if (matchEncontrado) {
            System.out.println("Se encontro la palabra");
        } else {
            System.out.println("No se encontro la palabra");
        }
    }
}
