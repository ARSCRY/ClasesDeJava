//Importando el package

import java.util.*;

public class PackagesPrograma {
    public static void main(String[] args) {
        Scanner miNombre = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");

        String nombreUsuario = miNombre.nextLine();
        System.out.println("Nombre de usuario: "+nombreUsuario);
        miNombre.close();
    }
}
