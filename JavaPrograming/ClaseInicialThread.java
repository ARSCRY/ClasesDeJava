public class ClaseInicialThread extends Thread {
    public static void main(String[] args) {
        ClaseInicialThread thread = new ClaseInicialThread();
        thread.start();
        System.out.println("Este codigo esta afuera del hilo");
    }

    public void run() {
        System.out.println("Este codigo esta compilando un hilo");
    }
}
