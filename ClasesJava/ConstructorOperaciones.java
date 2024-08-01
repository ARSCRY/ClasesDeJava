public class ConstructorOperaciones {
    int x, y, suma = 0;

    public ConstructorOperaciones(int valor1, int valor2) {
        x = valor1;
        y = valor2;
        suma = valor1 + valor2;
    }

    public static void main(String[] args) {
        ConstructorOperaciones constante = new ConstructorOperaciones(4, 5);

        System.out.println("Suma: " + constante.x + " + " + constante.y + " = " + constante.suma);
    }

}
