public class PrivateClass {
    private String nombres = "Javier Hernandez";
    private int edad = 38;
    private String nickname = "Chicharito";

    public static void main(String[] args) {
        PrivateClass valorNuevo = new PrivateClass();

        System.out.println("Nombres: "+valorNuevo.nombres);
        System.out.println("Edad: "+valorNuevo.edad);
        System.out.println("Apodo: "+valorNuevo.nickname);
    }

}
