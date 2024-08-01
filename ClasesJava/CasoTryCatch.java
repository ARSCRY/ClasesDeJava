public class CasoTryCatch {
    public static void main(String[] args) {
        try {
            int[] arreglo = { 1, 2, 3, 4 };
            System.out.println(arreglo[10]);
        } catch (Exception e) {
            System.out.println("Algo mal ha ocurrido");
        } finally {
            System.out.println("El proceso ha finalizado");
        }

    }

}
