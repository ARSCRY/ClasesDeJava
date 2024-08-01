import java.util.ArrayList;
import java.util.Iterator;

public class ClaseIteratorEjemplo {
    public static void main(String[] args) {
        ArrayList<Integer> codigos = new ArrayList<Integer>();

        codigos.add(4);
        codigos.add(29);
        codigos.add(15);
        codigos.add(11);

        Iterator<Integer> eso = codigos.iterator();

        while (eso.hasNext()) {
            Integer i = eso.next();
            if (i < 20) {
                eso.remove();
            }
        }
        System.out.println(codigos);
    }

}
