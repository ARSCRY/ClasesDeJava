import java.util.ArrayList;
import java.util.Iterator;

public class ClaseIterator2 {
    public static void main(String[] args) {
        ArrayList<String> nombresDeAnimes = new ArrayList<String>();
        nombresDeAnimes.add("Pluto");
        nombresDeAnimes.add("Death Note");
        nombresDeAnimes.add("Naruto");
        nombresDeAnimes.add("Kengan Ashura");

        // Iterator
        Iterator<String> it = nombresDeAnimes.iterator();

        System.out.println("Lista: ");
        // Ver la lista del arreglo
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
