import java.util.LinkedList;

public class ClaseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> nombres = new LinkedList<String>();

        nombres.add("Santiago");
        nombres.add("Lorena");
        nombres.add("Abby");
        nombres.add("William");
        nombres.add("Carlos");

        System.out.println(nombres);

        // Agregar al inicio
        System.out.println("Agregando nombre al inicio: ");
        nombres.addFirst("Camila");
        System.out.println(nombres);

        // Agregar al final
        System.out.println("Agregando nombre al final: ");
        nombres.addLast("Diego");
        System.out.println(nombres);

        //Remover al inicio
        System.out.println("Removiendo nombre al inicio: ");
        nombres.removeFirst();
        System.out.println(nombres);

        //Remover al final
        System.out.println("Removiendo nombre al final: ");
        nombres.removeLast();
        System.out.println(nombres);

        //Valor del inicio
        System.out.println("Valor de inicio: "+nombres.getFirst());

        //Valor del final
        System.out.println("Valor del final: "+nombres.getLast());
        

    }
}