public class NoOverridePOO {
    final  double PI =3.1416; //palabra reservada "final" para no cambiar la constante
    public static void main(String[] args) {
        NoOverridePOO valor = new NoOverridePOO();
        valor.PI = 2.7371;
        System.out.println(valor.PI);

    }
    
}
