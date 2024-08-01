public class HerenciaAnime {
    protected String anime = "Shonen"; // atributo

    public void casaAnimacion() {
        System.out.println("Toei Animation presents");
    }

}

class SubclaseAnime extends HerenciaAnime {
    private String nombre = "One Piece"; // atributo de Subclase
    private String mangaka = "Eichiiro Oda"; // atributo de Subclase

    public static void main(String[] args) {
        SubclaseAnime animeFavorito = new SubclaseAnime(); // creacion del objeto

        animeFavorito.casaAnimacion(); // llamada del metodo casaAnimacion()

        System.out.println("Anime: " + animeFavorito.nombre);
        System.out.println("Anime tipo: " + animeFavorito.anime);
        System.out.println("Creador: " + animeFavorito.mangaka);
    }

}
