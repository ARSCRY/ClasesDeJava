import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TiempoConFormato {
    public static void main(String[] args) {
        LocalDateTime objetoSinFormato = LocalDateTime.now();

        System.out.println("Sin formato: "+objetoSinFormato);

        DateTimeFormatter objetoConFormato = DateTimeFormatter.ofPattern("dd//MM/yyyy HH:mm:ss");

        String diaFormato = objetoSinFormato.format(objetoConFormato);
        System.out.println("Con formato: "+diaFormato);

    }

    
}
