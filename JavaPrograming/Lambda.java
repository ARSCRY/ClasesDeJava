import java.util.ArrayList;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> vector = new ArrayList<Integer>();

        vector.add(4);
        vector.add(15);
        vector.add(24);
        vector.add(36);
        vector.add(43);
        vector.add(12);
        vector.add(7);

        vector.forEach((n) -> {System.out.println(n);});
    }
    
}
