class Outer {
    int x = 10;

    class Inner {
        public int metodoInterior() {
            return x;
        }

    }
}

public class ClaseAnidadaMetodo {
    public static void main(String[] args) {
        Outer miObjetoExterior = new Outer();
        Outer.Inner miObjetoInterior = miObjetoExterior.new Inner();

        System.out.println(miObjetoInterior.metodoInterior());

    }  
}
