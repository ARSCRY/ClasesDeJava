public class CarroPOO {
    public void acelerarAuto(){
        System.out.println("El auto va a toda velocidad");
    }

    public void velocidadAutoMax (int velocidad){
        System.out.println("Velocidad : "+velocidad);
    }
    
    public static void main(String[] args) {
        CarroPOO miCarro = new CarroPOO();

        miCarro.acelerarAuto();
        miCarro.velocidadAutoMax(200);
    }
}
