package herencia;

public class Progenitor {

    //Propietats
    private int propEntera;
    protected boolean propLogica;
    char propCaracter;
    public static double propDecimal;

    private static String propStringEstatica;

    public static String getPropStringEstatica() {
        return propStringEstatica;
    }

    public static void setPropStringEstatica(String propStringEstatica) {
        Progenitor.propStringEstatica = propStringEstatica;
    }

    public int getPropEntera() {
        return propEntera;
    }

    public void setPropEntera(int propEntera) {
        this.propEntera = propEntera;
    }
}

class Filla extends Progenitor{

}

class Prova{

    public static void main(String[] args) {
        Filla filla=new Filla();
        Progenitor p=new Progenitor();
        p.propDecimal=20.5;
        Progenitor p1=new Progenitor();
        p1.propCaracter='a';
        System.out.println(p1.propDecimal);

        //Les props estàtiques se solen accedir utilitzant el nom de la classse
        Progenitor.propDecimal=30.6;
        System.out.println(Progenitor.propDecimal);
        System.out.println(p1.propDecimal);

    }


}