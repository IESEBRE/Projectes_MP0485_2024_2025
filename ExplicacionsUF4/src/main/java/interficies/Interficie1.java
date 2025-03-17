package interficies;

public interface Interficie1 {

    //Mètodes abstractes --> per defecte tots els mètodes són public i abstract
    void metode(int param);

    void metode(Interficie1 param);

}

class Classe1 implements Interficie1{
    @Override
    public void metode(int param) {
        System.out.println("Estic a la classe Classe1");
    }

    @Override
    public void metode(Interficie1 param) {
        if(param instanceof Classe1) System.out.println("EL paràmetre és de la mateixa classe que l'objecte actual");
        else if(param instanceof Classe2) System.out.println("EL paràmetre NO és de la mateixa classe que l'objecte actual");
    }

    public void metodeClasse1(){}
}

class Classe2 implements Interficie1{
    @Override
    public void metode(int param) {
        System.out.println("Estic a la classe Classe2");
    }

    @Override
    public void metode(Interficie1 param) {

    }

    public void metodeClasse2(){}
}


class Prova{
    public static void main(String[] args) {

        Interficie1 obj=new Classe2();
        //Interficie1 obj2=new String();  --> la classe ha d'implementar la interficie

        obj.metode(obj);
        if(obj instanceof Classe1)((Classe1)obj).metodeClasse1();
        else if(obj instanceof Classe2)((Classe2)obj).metodeClasse2();

    }
}
