public class CaseContinueWhile {
    public static void main(String[] args) {
        int j = 0;
        while (j<10) {
            System.out.println(j);
            j++;
            if (j==6) {
                j++;
                continue;
            }
        }
    }
    
}
