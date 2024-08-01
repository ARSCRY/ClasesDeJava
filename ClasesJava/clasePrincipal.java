class ClaseExterior {
    int x = 4;

    class ClaseInterior {
        int y = 7;
    }
}

public class clasePrincipal {
    public static void main(String[] args) {
        ClaseExterior miObjetoExterior = new ClaseExterior();
        ClaseExterior.ClaseInterior miObjetoInterior = miObjetoExterior.new ClaseInterior();

        System.out.println(miObjetoExterior.x + miObjetoInterior.y);
    
    }

}
