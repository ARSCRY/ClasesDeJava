class AnimalesPolimorfismo {

    public void sonidoAnimal() {
        System.out.println("Los animales hacen sonidos");
    }

}

class Perro extends AnimalesPolimorfismo {

    public void sonidoAnimal() {
        System.out.println("El perro ladra.");
    }

}

class Gato extends AnimalesPolimorfismo {

    public void sonidoAnimal() {
        System.out.println("El gato maulla");
    }
}

class Main {
    public static void main(String[] args) {
        AnimalesPolimorfismo miAnimal = new AnimalesPolimorfismo();
        Perro miPerro = new Perro();
        Gato miGato = new Gato();

        miAnimal.sonidoAnimal();
        miPerro.sonidoAnimal();
        miGato.sonidoAnimal();
    }

}