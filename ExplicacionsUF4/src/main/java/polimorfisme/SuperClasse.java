package polimorfisme;

public class SuperClasse {

    //Propietats
    protected int prop=23;
    public static final String nom="Pepe";     //propietat final o més coneguda com a constant (solen ser estàtiques)

    //Mètodes sobrecarregats --> polimorfisme part 1
    public void metodeSobrecarregat(){
        System.out.println("Sóc un mètode sense paràmetres");
    }

    public int metodeSobrecarregat(int param){
        System.out.println("Sóc un mètode sense paràmetres");
        return 1;
    }

    public int metodeSobrecarregat(float param2){
        System.out.println("Sóc un mètode sense paràmetres");
        return 1;
    }

    //Mètode per ser sobreescrit
    public void metodeSobreEscrit(){
        System.out.println("Seré un mètode sobreescrit");
    }

    //Mètode que no pot ser sobreescrit
    public final void metodeFinal(){
        System.out.println("Sóc un mètode que n o pot ser sobreescrit...");
    }



    public static void main(String[] args) {
        int i;
        SuperClasse s=new SuperClasse();

        int j=s.metodeSobrecarregat(34);

        SubClasse f=new SubClasse();

        System.out.println(f.prop);

        f.metodeSobreEscrit();

        SuperClasse s2=(SuperClasse)f;
        System.out.println(s2.prop);
    }

}

class SubClasse extends SuperClasse{
    //Propietats
    public int prop;           //propietat sobreescrita


    //Mètode sobreescrit --> polimorfisme part 2
    @Override
    public void metodeSobreEscrit() {
        System.out.println("Ja sóc un mètode sobreescrit...");
        System.out.println("La meua prop val "+this.prop);
        System.out.println("i la de mon pare val "+super.prop);
    }

    //Els mètodes finals no es poden sobreescriure
//    @Override
//    public void metodeFinal(){
//        System.out.println("Sóc un mètode que n o pot ser sobreescrit...");
//    }
}

//Classe que no es pot estendre --> no pot tindre descendència
final class Esteril{}

//No podem estendre una classe final
//class FillaEsteril extends Esteril{}