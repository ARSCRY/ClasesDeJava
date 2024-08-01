import java.io.File;
import java.util.Scanner;

public class DeleteFolder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el nombre la carpeta a borrar: ");
        String nombreCarpeta = scanner.nextLine();
        scanner.close();

        File myObj = new File(nombreCarpeta);
        if (myObj.delete()) {
            System.out.println("Carpeta borrada: " + myObj.getName());
        } else {
            System.out.println("Error al borrar carpeta.");
        }
    }
}
