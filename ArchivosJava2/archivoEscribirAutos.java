import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class archivoEscribirAutos {

    public static void main(String[] args) {
        try {
            ArrayList<String> marcaAutos = new ArrayList<String>();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Escriba el nombre del archivo a escribir sobre el: ");
            String nombreArchivo = scanner.nextLine();

            System.out.println("Cantidad de autos a ingresar: ");
            int cantidadAutos = scanner.nextInt();

            scanner.nextLine(); 

            System.out.println("Escriba la marca de autos a registrar: ");

            for (int i = 1; i <= cantidadAutos; i++) {
                String auto = scanner.nextLine();
                marcaAutos.add(auto);
            }
            scanner.close();
            FileWriter escribirArchivo = new FileWriter(nombreArchivo);

            
            for (String auto : marcaAutos) {
                escribirArchivo.write(auto + "\n");     
            }

            escribirArchivo.close();
            System.out.println("Escritura de archivo Exitosa");
        } catch (IOException e) {
            System.out.println("Un error ha ocurrido");
            e.printStackTrace();
        }
    }
}
