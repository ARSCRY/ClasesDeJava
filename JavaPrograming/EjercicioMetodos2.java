public class EjercicioMetodos2 {
    static void edadParaSugragar(int edad){
        if (edad> 0 && edad<18){
            System.out.println("No esta en edad para votar.");
        }
        else if(edad>=18){
            System.out.println("Usted ya puede votar");
        }
        else{
            System.out.println("Edad no valida");
        }
    }

    public static void main(String[] args) {
        edadParaSugragar(-18);
    }
    
}
