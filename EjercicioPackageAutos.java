import java.util.*;

public class EjercicioPackageAutos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la marca: ");
        String marcaAuto = scanner.nextLine();

        System.out.println("Ingrese el modelo: ");
        String modeloAuto = scanner.nextLine();
        
        System.out.println("Ingrese el año: ");
        String añoAuto = scanner.nextLine();
       
         System.out.println("Datos finales: ");
        System.out.println("Carro: " + marcaAuto);
        System.out.println("Modelo: " + modeloAuto);
        System.out.println("Año: " + añoAuto);
       
        scanner.close();

    }

}
