public class Funciones {

    static int SumaNumero(int x, int y){
        int suma = x+y;
        return suma;
    }
    
    static int RestaNumero(int x, int y){
        int resta = x-y;
        return resta;
    }

    static int ProductoNumero(int x, int y){
        int producto = x*y;
        return producto;
    }

    static double DivisionNumero(int x, int y){
        double division = (double) x/y;
        return division;
    }


    public static void main(String[] args) {
        System.out.println("Escoge una operacion: ");
        System.out.println("1.Suma // 2.Resta // 3.Multiplicacion // 4.Division: ");
        System.out.println("La suma de los numeros es: " +SumaNumero(4, 3));
        System.out.println("La resta de los numeros es: " +RestaNumero(4, 3));
        System.out.println("La multiplicacion de los numeros es: " +ProductoNumero(4, 3));
        System.out.println("La division de los numeros es: " +DivisionNumero(4, 3));
    }

}
