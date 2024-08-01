public class MultiplesObjetos {
    int valor = 25;
    public static void main(String[] args) {
        MultiplesObjetos myObject = new MultiplesObjetos();
        MultiplesObjetos myObject2 = new MultiplesObjetos();

        myObject2.valor = 35;

        System.out.println(myObject.valor);
        System.out.println(myObject2.valor);
    }
    
}
