public class ProblemasConcurrencia2 extends Thread {
    public static int cont = 0;

    public static void main(String[] args) {
        ProblemasConcurrencia2 hilo2 = new ProblemasConcurrencia2();
        hilo2.start();
        while (hilo2.isAlive()) {
            System.out.println("Waiting..");
        }
        System.out.println("ProblemaConcurrencia2: " + cont);
        cont++;
        System.out.println("ProblemaConcurrencia2: " + cont);
    }

    public void run() {
        cont++;
    }

}
