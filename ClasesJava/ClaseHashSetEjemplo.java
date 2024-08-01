import java.util.HashSet;

public class ClaseHashSetEjemplo {
    public static void main(String[] args) {
        HashSet<Integer> listaNumeros = new HashSet<Integer>();

        listaNumeros.add(2);
        listaNumeros.add(5);
        listaNumeros.add(8);

        for (int i = 0; i < 10; i++) {
            if (listaNumeros.contains(i)) {
                System.out.println("El numero " + i + " fue encontrado.");
            } else {
                System.out.println("El numero " + i + " no fue encontrado.");
            }

        }

    }

}
