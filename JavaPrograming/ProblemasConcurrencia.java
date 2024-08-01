public class ProblemasConcurrencia extends Thread {
    public static int contador = 0;

    public static void main(String[] args) {
        ProblemasConcurrencia hilo = new ProblemasConcurrencia();
        hilo.start();
        System.out.println(contador);
        contador++;
        System.out.println(contador);
    }

    public void run(){
        contador++;
    }
}
