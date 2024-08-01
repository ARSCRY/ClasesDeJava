import java.util.*;

public class PracticaN1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido  nuevo usuario");
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre);

        System.out.println("Ingresa un numero para ver la tabla de multiplicar: ");
        int num = scanner.nextInt();

        /*Usando for */
        for (int i = 0; i <12; i++) {
            System.out.println(num + "x " + i + " = " + num * i);
        }

        scanner.close();
    }
}
