import java.util.*;

public class CasoTryCatchYTrhow {

    static void verificarEdad(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la edad: ");
        int edadObtenida = scanner.nextInt();

        if (edadObtenida<18) {
            throw new ArithmeticException("No puede acceder al tragamonedas.");
        }
        else{
            System.out.println("Usted puede pasar.");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        verificarEdad();
    }
}