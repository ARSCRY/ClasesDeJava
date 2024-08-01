import java.util.HashSet;

public class ClaseHashSet {
    public static void main(String[] args) {
        HashSet<String> nombresCarros = new HashSet<String>();

        nombresCarros.add("Volvo");
        nombresCarros.add("Toyota");
        nombresCarros.add("Volvo");
        nombresCarros.add("Jeep");
        nombresCarros.add("Mazda");
        nombresCarros.add("Fiat");

        System.out.println("Lista de autos: ");
        System.out.println(nombresCarros);

        // Tamaño
        System.out.println("Tamaño del arreglo: " + nombresCarros.size());

        // Loop
        System.out.println("Ver con foreach: ");
        for (String i : nombresCarros) {
            System.out.println(i);
        }

        // Verificar si un item existe
        System.out.println("Un item existe?: " + nombresCarros.contains("Fiat"));
        System.out.println("Un item existe?: " + nombresCarros.contains("Honda"));

        // Remover
        System.out.println("Remover: ");
        nombresCarros.remove("Mazda");
        System.out.println(nombresCarros);

        // Limpiar
        System.out.println("Limpiando: ");
        nombresCarros.clear();
        System.out.println(nombresCarros);

    }

}