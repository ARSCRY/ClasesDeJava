
/**
 * Hallar el area de un circulo
 */

import java.util.*;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PROGRAMA PARA HALLAR EL AREA DE UN CIRCULO");
        System.out.print("Digite el radio (en cm): ");
        Double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El area de la circunferencia es: " + (float) area + " cm2");
        scanner.close();
    }
}