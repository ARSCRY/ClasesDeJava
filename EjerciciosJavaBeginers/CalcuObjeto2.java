import java.util.Scanner;

public class CalcuObjeto2 {
    public static void main(String[] args) {
        CalcuObjeto objeto_principal = new CalcuObjeto();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero: ");
        int num = scanner.nextInt();

        System.out.println("Numero siguiente: ");
        int num2 = scanner.nextInt();

        System.out.println("Escoja Suma (S), Resta (R), Multiplicar (M) o Dividir (D): ");
        char opcion = scanner.next().charAt(0);
        if (opcion == 'S' || opcion == 's') {
            objeto_principal.Sumar(num, num2);
        } else if (opcion == 'R' || opcion == 'r') {
            objeto_principal.Restar(num, num2);
        } else if (opcion == 'M' || opcion == 'm') {
            objeto_principal.Multiplicar(num, num2);
        } else if (opcion == 'D' || opcion == 'd') {
            objeto_principal.Dividir(num, num2);
        } else {
            System.out.println("Opcion no valida");
        }
        scanner.close();
    }
}
