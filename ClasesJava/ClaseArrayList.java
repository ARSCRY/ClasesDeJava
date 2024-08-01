import java.util.ArrayList;

public class ClaseArrayList {
    public static void main(String[] args) {
        ArrayList<String> automoviles = new ArrayList<String>();

        automoviles.add("Volvo");
        automoviles.add("Toyota");
        automoviles.add("Nisan");
        automoviles.add("Audi");
        automoviles.add("Ford");

        System.out.println(automoviles);

        System.out.println("Valores en el array: " + automoviles.size());

        // Acceder a u item
        System.out.println("Accediendo a 0: " + automoviles.get(0));

        // Cambiar un item
        automoviles.set(0, "Jeep");

        System.out.println(automoviles);

        // Eliminar un item

        automoviles.remove(0);

        System.out.println(automoviles);

        // Limpiar el vector
        automoviles.clear();
        System.out.println(automoviles);

        ArrayList<Integer> numeros = new ArrayList <Integer>();

        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        System.out.println("Lista de vectores con for");
        
        for (int i : numeros) {
            System.out.println(i);
        }

    }
}
