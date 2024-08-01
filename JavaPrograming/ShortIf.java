public class ShortIf {
    public static void main(String[] args) {
        //Operador ternario (reduccion del condicional if)
        /*variable = (condition) ? expressionTrue :  expressionFalse;*/

        int edad = 25;
        String voto = (edad < 18) ? "No puedes votar ": "Puedes votar";

        System.out.println(voto);
    }
    
}
