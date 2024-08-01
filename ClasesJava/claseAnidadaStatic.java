class Exterior {
    int x = 10;

    static class Interior {
        int y = 5;
    }
}

public class claseAnidadaStatic {
    public static void main(String[] args) {

        Exterior.Interior miObjInterior = new Exterior.Interior();

        System.out.println(miObjInterior.y);

    }
}
