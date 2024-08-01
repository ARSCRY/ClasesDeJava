public class VehiculoHerencia {
    protected String marca = "Jeep";

    public void clacson() {
        System.out.println("Tuk,tuk");
    }
}

class Auto extends VehiculoHerencia {
    private String modelo = "Cherokee";

    public static void main(String[] args) {
        Auto miAuto = new Auto();

        miAuto.clacson();

        System.out.println(miAuto.marca + " " + miAuto.modelo);

    }

}
