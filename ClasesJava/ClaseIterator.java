import java.util.ArrayList;
import java.util.Iterator;

public class ClaseIterator {
    public static void main(String[] args) {
        ArrayList<String> nombresDeAnimes = new ArrayList<String>();
        nombresDeAnimes.add("Pluto");
        nombresDeAnimes.add("Death Note");
        nombresDeAnimes.add("Naruto");
        nombresDeAnimes.add("Kengan Ashura");

        // Iterator
        Iterator<String> it = nombresDeAnimes.iterator();

        // Print del primer item
        System.out.println(it.next());
    }

}
