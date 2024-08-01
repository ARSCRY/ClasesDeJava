public class EjercicioVectores {
    public static void main(String[] args) {
        int vector[] = { 12, 25, 37, 55, 91, 74 };
        int sum = 0;
        int tamaño = vector.length;

        for (int i : vector) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i : vector) {
            sum += i;
        }
        System.out.println("Suma de los elementos del vector: " + sum);
        System.out.println("Promedio: " + sum/tamaño);
    }

}