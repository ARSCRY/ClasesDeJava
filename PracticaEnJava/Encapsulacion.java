import java.util.*;

public class Encapsulacion {
    private String nombre;
    private String usuario;

    public Encapsulacion(String nombreDato,String usuarioDato){
        nombre = nombreDato;
        usuario = usuarioDato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingresar usuario: ");
        String usuario = scanner.nextLine();

        Encapsulacion persona = new Encapsulacion(nombre,usuario);
        

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Usuario: " + persona.getUsuario());

        scanner.close();
    }
}
