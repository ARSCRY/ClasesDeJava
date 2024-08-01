import java.util.*;

public class InputScanner {
    public static void main(String[] args) {
        Scanner datosPersona = new Scanner(System.in);

        System.out.print("Ingrese sus nombre completo: ");
        String nombre = datosPersona.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = datosPersona.nextInt();

        System.out.print("Ingrese el salario que gana: ");
        float salario = datosPersona.nextFloat();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);

        datosPersona.close();
    }
}
