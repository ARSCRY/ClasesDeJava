public class ConstructorPrograma {
    String marcaAuto;
    String modeloAuto;
    int añoAuto;

    public  ConstructorPrograma(String marca, String modelo, int año) {
        marcaAuto = marca;
        modeloAuto = modelo;
        añoAuto = año;
    }

    public static void main(String[] args) {
        ConstructorPrograma miAuto = new ConstructorPrograma("Dodge","Challenger", 1973);
        
        System.out.println("Marca: "+miAuto.marcaAuto);
        System.out.println("Modelo: "+miAuto.modeloAuto);
        System.out.println("Año: "+miAuto.añoAuto);

    }

}
