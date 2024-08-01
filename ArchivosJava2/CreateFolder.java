import java.io.File;
import java.util.Scanner;

public class CreateFolder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el nombre de la carpeta: ");
        String nombreCarpeta = scanner.nextLine();

        File miCarpeta = new File(nombreCarpeta);

        if (!miCarpeta.exists()) {
            boolean creado = miCarpeta.mkdir();
            if (creado) {
                System.out.println("Carpeta creada.");
            } else {
                System.out.println("No se puede crear la carpeta.");
            }
        } else {
            System.out.println("La carpeta ya existe.");
        }
        scanner.close();
    }
}
