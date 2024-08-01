import java.util.*;

class EjercicioAreasPOO {
    static double areaFiguraCuadrado(double x) {
        return Math.pow(x, 2);
    }

    static double areaFiguraCirculo(double x) {
        return Math.pow(x, 2) * Math.PI;
    }

    static double areaFiguraRectangulo(double x, double y) {
        return x * y;
    }

    static double areaFiguraTriangulo(double x, double y) {
        return (x * y) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Cuadrado");
        System.out.println("2.Circulo");
        System.out.println("3.Rectangulo");
        System.out.println("4.Triangulo");
        System.out.println("Escoja una de estas opciones: ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                System.out.println("Area del cuadrado: " + areaFiguraCuadrado(lado));
                break;

            case 2:
                System.out.println("Ingrese el radio del circulo: ");
                double radio = scanner.nextDouble();
                System.out.println("Area del circulo: " + areaFiguraCirculo(radio));
                break;
            case 3:
                System.out.println("Ingrese la base del rectangulo: ");
                double base = scanner.nextDouble();

                System.out.println("Ingrese la altura del rectangulo: ");
                double altura = scanner.nextDouble();

                System.out.println("Area del rectangulo: " + areaFiguraRectangulo(base, altura));
                break;

            case 4:
                System.out.println("Ingrese la base del rectangulo: ");
                double base_triangulo = scanner.nextDouble();

                System.out.println("Ingrese la altura del rectangulo: ");
                double altura_triangulo = scanner.nextDouble();

                System.out.println("Area del rectangulo: " + areaFiguraTriangulo(base_triangulo, altura_triangulo));
                break;

            default:
                System.out.println("Opcion no valida");
                break;
        }
        scanner.close();
    }
}
