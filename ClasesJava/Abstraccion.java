abstract class Abstraccion {
    public abstract void sonidosAnimal();

    public void dormir() {
        System.out.println("ZZZZ");
    }
}

class Perro extends Abstraccion {
    public void sonidosAnimal() {
        System.out.println("El perro ladra");
    }

}

class Gato extends Abstraccion {
    public void sonidosAnimal() {
        System.out.println("El gato maulla");
    }

}

class Inicio {
    public static void main(String[] args) {
        Perro miMascota = new Perro();
        miMascota.sonidosAnimal();
        miMascota.dormir();

        Gato miFiera = new Gato();
        miFiera.sonidosAnimal();
        miFiera.dormir();

    }

}