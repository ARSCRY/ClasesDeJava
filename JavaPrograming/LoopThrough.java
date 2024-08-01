public class LoopThrough {
    public static void main(String[] args) {
        String [] nombres = {"Jhamir", "Carlos", "Diego"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        System.out.println("=====================================================");
        //For-Each Loop
        //for (type variable : arrayname)

        String [] names = {"Pedro", "Carlos", "Diego"};
        for (String i : names) {
            System.out.println(i);
        }
    }
}
