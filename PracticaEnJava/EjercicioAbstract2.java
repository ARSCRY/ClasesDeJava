class EjercicioAbstract2 {
    public static void main(String[] args) {
        Estudiante nuevoEstudiante = new Estudiante();
        System.out.println("Nombre: " + nuevoEstudiante.nombre);
        System.out.println("Apellido: " + nuevoEstudiante.apellido);
        System.out.println("Edad: " + nuevoEstudiante.edad);
        System.out.println("Año de graduacion: " + nuevoEstudiante.añoGraduacion);

        nuevoEstudiante.estudio();
    }

}
