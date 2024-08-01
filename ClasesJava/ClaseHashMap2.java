import java.util.HashMap;

public class ClaseHashMap2 {
    public static void main(String[] args) {
        HashMap<String, Integer> datos = new HashMap<String, Integer>();

        // key:nombre value: edad
        datos.put("Carlos", 30);
        datos.put("Pamela", 29);
        datos.put("Franco", 26);

        // para mostrar key, keySet()
        System.out.println("Monstrando nombre (key): ");
        for (String i : datos.keySet()) {
            System.out.println(i);
        }

        // para mostrar value, values()
        System.out.println("Monstrando edad (value): ");
        for (Integer i : datos.values()) {
            System.out.println(i);
        }

        // para mostrar key y value
        System.out.println("Mostrando ambos (key y value): ");
        for (String i : datos.keySet()) {
            System.out.println("Nombre: "+i+", Edad: "+datos.get(i));
        }

    }

}
