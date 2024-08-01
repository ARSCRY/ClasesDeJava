import java.util.ArrayList;
import java.util.Collections;

public class ClaseSortArrayList {
    public static void main(String[] args) {

        ArrayList<String> animes = new ArrayList<String>();
        animes.add("Naruto");
        animes.add("One Piece");
        animes.add("One Punch Man");
        animes.add("Death Note");
        animes.add("Berseck");

        // Orden el orden del arreglo
        Collections.sort(animes);

        System.out.println("Arreglo de cadenas: ");

        System.out.println(animes);
        System.out.println("Tamaño: " + animes.size());

        for (String string : animes) {
            System.out.println(string);
        }

        System.out.println("Arreglo de numeros enteros: ");

        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

        listaNumeros.add(0);
        listaNumeros.add(23);
        listaNumeros.add(-5);
        listaNumeros.add(51);
        listaNumeros.add(15);
        listaNumeros.add(150);

        System.out.println(listaNumeros);
        System.out.println("Tamaño del arreglo de enteros: "+listaNumeros.size());

        Collections.sort(listaNumeros);

        System.out.println("Ordenado un arreglo de enteros: ");

        for (Integer integer : listaNumeros) {
            System.out.println(integer);
        }

    }
}
