abstract class EjercicioAbstract {
    public String nombre = "Carlos";
    public String apellido = "Ramos";
    public int edad = 22;

    public abstract void estudio();
}

class Estudiante extends EjercicioAbstract {
    public int añoGraduacion = 2022;

    public void estudio() {
        System.out.println("Ha completado sus estudios superiores");
    }
}

