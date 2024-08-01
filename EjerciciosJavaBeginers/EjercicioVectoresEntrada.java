import java.util.*;

public class EjercicioVectoresEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// cantidad de valores en el arreglo
        ArrayList <Integer> arreglo = new ArrayList <Integer>();
        System.out.println("Cantidad a ingresar en el arreglo: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Elemento ["+i+"]-->");
            int valores = scanner.nextInt();
            arreglo.add(valores);
        }

        System.out.println("Vector: ");
        for (Integer integer : arreglo) {
            System.out.print(integer+" ");
        }
        scanner.close();
    }
}
