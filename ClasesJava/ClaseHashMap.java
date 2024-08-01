import java.util.HashMap;

public class ClaseHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitalPaises = new HashMap<String, String>();

        // Agregar valores con put()
        capitalPaises.put("Lima", "Peru");
        capitalPaises.put("Buenos Aires", "Argentina");
        capitalPaises.put("Bogota", "Colombia");
        capitalPaises.put("La Paz", "Bolivia");

        System.out.println("HashMap: ");
        System.out.println(capitalPaises);

        //Tamaño del HashMap
        System.out.println("Tamaño del HashMap: "+capitalPaises.size());

        // Acceder a un item
        System.out.println("Accediendo a un value: ");
        System.out.println(capitalPaises.get("La Paz"));

        // Removiendo un item
        System.out.println("Removiendo un item");
        System.out.println(capitalPaises.remove("La Paz"));

        System.out.println(capitalPaises);

        // Removiendo todo de un item

        System.out.println("Nuevo item: ");
        capitalPaises.clear();
        System.out.println(capitalPaises);

    }

}
