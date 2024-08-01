enum Nivel {
    GRANDE,
    REGULAR,
    BAJO
}

public class EjemploENUM_Loop {
    public static void main(String[] args) {
        for (Nivel constante : Nivel.values()) { // values() metodo a usar
            System.out.println(constante);
        }
    }
}
