public class CaseContinueLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){ 
        if (i==4) {
            continue;//No aparece el valor de "4"
        }
        System.out.println(i);
    }
    }
    
}
