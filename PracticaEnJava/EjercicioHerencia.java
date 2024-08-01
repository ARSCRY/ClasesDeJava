class EjercicioHerencia {
    protected String serie = "Drake y Josh";

    public void verSerie() {
        System.out.println("");
    }
}

class Subclase extends EjercicioHerencia {
    private String actor = "Drake Bell";

    public static void main(String[] args) {
        Subclase objetoHerencia = new Subclase();

        objetoHerencia.verSerie();

        System.out.println("Serie: " + objetoHerencia.serie);
        System.out.println("Actor: " + objetoHerencia.actor);
    }

}
