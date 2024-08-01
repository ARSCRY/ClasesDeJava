public class StaticvsPublic {
    static void miMetodoStatic(){
        System.out.println("Static sin crear objetos");
    }

    public void miMetodoPublic(){
        System.out.println("Public deben ser llamados con \"objetos\"");
    }

    public static void main(String[] args) {
        miMetodoStatic();
        //miMetodoPublic(); Error

        StaticvsPublic miObjeto = new StaticvsPublic();

        miObjeto.miMetodoPublic();


    }
    
}
