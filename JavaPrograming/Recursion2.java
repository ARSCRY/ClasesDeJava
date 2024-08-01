public class Recursion2 {
    public static void main(String[] args) {
        int suma = funcionSuma(5,10);
        System.out.println(suma);
    }

    public static int funcionSuma(int inicio, int fin){
            if (fin>inicio){
                return fin + funcionSuma(inicio,fin-1);  
            }
            else{
                return fin;
            }            
    }
}

    

