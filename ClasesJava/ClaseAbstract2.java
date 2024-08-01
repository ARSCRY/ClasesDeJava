class ClaseAbstract2 {
    public static void main(String[] args) {
        Equipo miTeam = new Equipo();

        System.out.println("Club: "+miTeam.equipo);
        System.out.println("Año de fundacion: "+miTeam.añoFundacion);
        System.out.println("Año campeon: "+miTeam.añoCampeon);
        miTeam.visita(); // llamada al metodo abstract
    }
    
}


