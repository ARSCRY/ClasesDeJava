public abstract class ClaseAbstract { // clase abstracta
    public String equipo = "Manchester United";
    public int añoFundacion = 1878;

    public abstract void visita();
}

class Equipo extends ClaseAbstract {
    public int añoCampeon = 2013;

    public void visita() {
        System.out.println("Ultima Premier ganada");
    }
}
