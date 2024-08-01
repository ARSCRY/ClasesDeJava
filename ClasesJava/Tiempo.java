import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Tiempo {
    public static void main(String[] args) {
        LocalDate objetoFecha = LocalDate.now(); // observar la creacion del objeto objetoAhora
        LocalTime objetoTiempo = LocalTime.now();
        LocalDateTime objetoFechaTiempo = LocalDateTime.now();
        

        System.out.println(objetoFecha);
        System.out.println(objetoTiempo);
        System.out.println(objetoFechaTiempo);
    }

}
