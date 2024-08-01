import java.util.ArrayList;
import java.util.function.Consumer;;

public class Lambda2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(7);        
        numeros.add(71);        
        numeros.add(45);        
        numeros.add(59);
        
        Consumer <Integer> metodo = (n)->{System.out.println(n);};

        numeros.forEach(metodo);

    }

}
