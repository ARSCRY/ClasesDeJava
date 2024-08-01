enum Valoracion {
    SATISFECHO,
    CONFORME,
    INSATISFECHO
}

public class EjemploENUM_Switch {
    public static void main(String[] args) {
        Valoracion valorOtorgado = Valoracion.CONFORME;

        switch (valorOtorgado) {
            case SATISFECHO:
                System.out.println("Estoy satisfecho con la compra");
                break;

            case CONFORME:
                System.out.println("Estoy conforme con la compra");
                break;

            case INSATISFECHO:
                System.out.println("Estoy insatisfecho con la compra");
                break;

            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}
