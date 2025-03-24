package enumeracions;

public enum EnumeracioComplexa{

    //CONSTANTS de l'enumeració
    MERCURI(1,2), VENUS(2,3), TERRA(3,4), LLUNA(5,6);
    public static final double G=9.81;

    //PROPIETATS DE L'ENUMERACIÓ
    private final int massa;
    private final double radi;

    //CONSTRUCTOR de l'enumeració
    private EnumeracioComplexa(int massa, double radi){
        this.massa=massa;
        this.radi=radi;
    }

    public int getMassa() {
        return massa;
    }

    public double getRadi() {
        return radi;
    }

    public double operacio(int valor){
        return this.massa+valor;
    }
}

class Prova2{

    public static void main(String[] args) {

        System.out.println("La massa de Mercuri és "+EnumeracioComplexa.MERCURI.getMassa());
        System.out.println("La massa de Mercuri segons la operació és "+EnumeracioComplexa.MERCURI.operacio(3));

        //Modem mostrar totes les constants d'una enumeració
        for(EnumeracioComplexa elem:EnumeracioComplexa.values()){
            System.out.println(elem.name());
            System.out.println(elem.ordinal());
            System.out.println(elem.getMassa());
            System.out.println(elem.getRadi());
            System.out.println();

        }

    }
}
