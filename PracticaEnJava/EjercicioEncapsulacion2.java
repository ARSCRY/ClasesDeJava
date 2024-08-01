import java.util.*;
public class EjercicioEncapsulacion2 {
    public static void main(String[] args) {
        EjercicioEncapsulacion objetoAnime = new EjercicioEncapsulacion();

        Scanner nombre= new Scanner(System.in);
        System.out.print("Ingrese el nombre del anime: ");
        String identificador = nombre.nextLine();

        objetoAnime.setAnime(identificador);

        System.out.println("Nombre del anime: " + objetoAnime.getAnime());
        nombre.close();
    }
}
