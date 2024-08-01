import java.io.File;
import java.util.Scanner;

public class DeleteArchivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el nombre del archivo (agregar al final \".txt\"): ");
        String nombreArchivo = scanner.nextLine();
        scanner.close();

        File objetoArchivo = new File(nombreArchivo);
        if (objetoArchivo.delete()) {
            System.out.println("Archivo borrado: "+objetoArchivo.getName());        
        }
        else{
            System.out.println("Borrar archivo fallado");
        }
    }
}
