public class castingJava {
    public static void main(String[] args) {
        //Widening Casting
        int miEntero = 9;
        double miDouble = miEntero; // Casteo de int a double
        
        System.out.println(miEntero);
        System.out.println(miDouble);

        System.out.println("Otra forma de casteo: ");

        //Narrowing Casting
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int
    
        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
     }
}
    

