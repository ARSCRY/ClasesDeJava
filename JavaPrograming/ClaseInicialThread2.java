public class ClaseInicialThread2 implements Runnable {
    public static void main(String[] args) {
        ClaseInicialThread2 obj = new ClaseInicialThread2();
        Thread hilo = new Thread(obj);
        hilo.start();
        System.out.println("This codigo esta afuera del hilo");
    }

    public void run(){
        System.out.println("Este codigo esta corriendo un hilo");
    }
}
