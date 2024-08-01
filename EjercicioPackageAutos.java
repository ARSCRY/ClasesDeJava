import java.util.*;

public class EjercicioPackageAutos {

    public static void main(String[] args) {

        Scanner marca = new Scanner(System.in);
        System.out.println("Ingrese la marca: ");
        String marcaAuto = marca.nextLine();

        Scanner modelo = new Scanner(System.in);
        System.out.println("Ingrese la modelo: ");
        String modeloAuto = modelo.nextLine();
        
        Scanner año = new Scanner(System.in);
        System.out.println("Ingrese la año: ");
        String añoAuto = año.nextLine();
       

        System.out.println("Datos del carro: " + marcaAuto);
        System.out.println("Datos del carro: " + modeloAuto);
        System.out.println("Datos del carro: " + añoAuto);
    }

}
