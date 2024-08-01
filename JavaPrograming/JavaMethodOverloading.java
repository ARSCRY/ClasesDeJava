public class JavaMethodOverloading {
    static int metodoSuma(int x, int y){
        return x+y;
    }

    static double metodoSuma(double x, double y){
        return x+y;
    }

    public static void main(String[] args) {
        int suma1 = metodoSuma(3,4);
        double suma2 = metodoSuma(4.23, 3.14);

        System.out.println("Suma int: "+metodoSuma(suma1, suma1));
        System.out.println("Suma double: "+metodoSuma(suma1, suma2));
    }
    
}
