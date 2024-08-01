public class WrapperClases {
    public static void main(String[] args) {
        Integer miEntero = 4;
        Double miDouble =5.32;
        Character miCharacter = 'a';

        System.out.println(miEntero);
        System.out.println(miDouble);
        System.out.println(miCharacter);

        System.out.println("==================================================");
        
        System.out.println(miEntero.intValue());
        System.out.println(miDouble.doubleValue());
        System.out.println(miCharacter.charValue());

        System.out.println("Metodo toString: ");

        Integer entero = 500;
        String cadena = entero.toString();

        System.out.println(cadena.length());

        
    }
    
}
