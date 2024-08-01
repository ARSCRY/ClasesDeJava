public class NuevoMain_2 {
    int x;

    public NuevoMain_2(int y) { // Usando una Clase Constructor
        x = y;
    }

    public static void main(String[] args) {

        NuevoMain_2 miValor = new NuevoMain_2(4);
        System.out.println(miValor.x);
    }

}
