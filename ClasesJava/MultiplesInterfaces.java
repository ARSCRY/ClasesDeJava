interface PrimeraInterface {
    public void miMetodo();
}

interface SegundaInterface {
    public void miOtroMetodo();
}

class DemoClass implements PrimeraInterface,SegundaInterface{
    public void miMetodo(){
        System.out.println("Primer mensaje");
    }

    public void miOtroMetodo(){
        System.out.println("Segundo mensaje");
    }
}



class MultiplesInterfaces {
    public static void main(String[] args) {
        DemoClass miObjetoEjemplo = new DemoClass();

        miObjetoEjemplo.miMetodo();
        miObjetoEjemplo.miOtroMetodo();

    }

}
