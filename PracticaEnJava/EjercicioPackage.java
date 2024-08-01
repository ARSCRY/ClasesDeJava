import java.util. *;
class EjercicioPackage {
    public static void main(String[] args) {
        Scanner miCorreo = new Scanner(System.in);
        System.out.print("Ingrese su correo electronico: ");

        String correoRegistrado = miCorreo.nextLine();

        System.out.println("Correo electronico digitado: "+correoRegistrado);
        miCorreo.close();
    }
    
}
