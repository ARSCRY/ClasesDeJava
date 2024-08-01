/*
Create a method which takes a lambda expression as a parameter:
 */
interface StringFunction {
    String run(String str);
}

public class Lambda3 {
    public static void main(String[] args) {
        StringFunction exclamar = (s) -> s + "!";
        StringFunction preguntar = (s) -> s + "?";

        mostrarFormato("Hola", preguntar);
        mostrarFormato("Hola", exclamar);

    }

    public static void mostrarFormato(String str, StringFunction formato) {
        String resultado = formato.run(str);
        System.out.println(resultado);
    }
}
