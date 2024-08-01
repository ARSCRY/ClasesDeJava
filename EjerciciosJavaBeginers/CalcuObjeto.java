public class CalcuObjeto {
    public void Sumar(int a, int b) {
        System.out.println("Suma: " + (a + b));
    }

    public void Restar(int a, int b) {
        System.out.println("Resta: " + (a - b));
    }

    public void Multiplicar(int a, int b) {
        System.out.println("Multiplicacion: " + (a * b));
    }

    public void Dividir(int a, int b) {
        try {
            System.out.println("Division: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error en el divisor");
        }
    }
}
