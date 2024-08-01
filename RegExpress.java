import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExpress {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Ecommerce", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Ecommerce Listo");
        boolean matchFooun = matcher.find();

        if (matchFooun) {
            System.out.println("Match encontrado");
        } else {
            System.out.println("Match no encontrado");
        }
    }
}
