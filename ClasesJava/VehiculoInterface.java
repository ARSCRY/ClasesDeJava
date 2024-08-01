interface VehiculoInterface {

    public void mensajeCarro();

    public void frenarCarro();

}

class Camioneta implements VehiculoInterface {

    public void mensajeCarro() {
        System.out.println("El auto esta por arrancar");
    }

    public void frenarCarro() {
        System.out.println("El auto va a frenar");
    }
}

class Principal {
    public static void main(String[] args) {
        Camioneta autoObjeto = new Camioneta();

        autoObjeto.mensajeCarro();
        autoObjeto.frenarCarro();
    }
}