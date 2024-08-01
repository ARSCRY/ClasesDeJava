public class Static {
    // metodo static
    static void miMetodoStatic() {
        System.out.println("Se pueden llamar métodos estáticos sin crear objetos.");
    }

    // metodo public
    public void miMetodoPublic() {
        System.out.println("Los métodos públicos deben llamarse creando objetos.");
    }

    public static void main(String[] args) {
        miMetodoStatic();// Call the static method
        // myPublicMethod(); This would output an error

        Static miObjeto = new Static(); // creacion del objeto de la clase Static
        miObjeto.miMetodoPublic();// llamando al metodo public

    }

}
