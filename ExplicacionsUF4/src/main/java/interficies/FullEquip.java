package interficies;

public interface FullEquip {

    //Constants --> totes les props d'una interfície són public static final
    int CONSTANT_FORMADA_PER_VARIES_PARAULES=23;

    //Mètodes abstractes --> ja ho hemn vist

    /* A partir de la versió 8 de Java apareixen els... */
    //Mètode estàtics implementats
    static void metodeEstatic(){
        System.out.println(CONSTANT_FORMADA_PER_VARIES_PARAULES);
    }

    //Mètodes default implementats
    default void metodePerDefecte(){
        System.out.println("Estic a un mètode per defecte");
    }

}

class ClasseFull implements FullEquip{

    @Override
    public void metodePerDefecte() {
        //FullEquip.super.metodePerDefecte();

        System.out.println("Faig més coses que les que feia el mètode per defecte de la interfície");
    }

    public static void main(String[] args) {
        ClasseFull o=new ClasseFull();
        o.metodePerDefecte();
    }
}