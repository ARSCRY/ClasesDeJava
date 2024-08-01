public class EjercicioConstructor {
    String anime, casaAnimadora, generoAnime;

    public EjercicioConstructor(String nombre, String nombreCasa, String tipo) {
        anime = nombre;
        casaAnimadora = nombreCasa;
        generoAnime = tipo;
    }

    public static void main(String[] args) {

        EjercicioConstructor animePrimer = new EjercicioConstructor("Naruto", "Pierrot", "Shonen");
        EjercicioConstructor animeSegundo = new EjercicioConstructor("Gangsta", "Pierrot", "Manglobe");

        System.out.println("Anime: " + animePrimer.anime + "\nCasa de Estudio: " + animePrimer.casaAnimadora
                + "\nGenero: " + animePrimer.generoAnime);
        System.out.println("Anime: " + animeSegundo.anime + "\nCasa de Estudio: " + animeSegundo.casaAnimadora
                + "\nGenero: " + animeSegundo.generoAnime);

    }

}
