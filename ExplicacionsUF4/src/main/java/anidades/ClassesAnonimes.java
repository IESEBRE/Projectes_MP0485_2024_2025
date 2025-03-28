package anidades;



public class ClassesAnonimes {

    //Propietats de la classe
    Interficie prop=new Interficie() {          //Objecte d'una classe anònima
        @Override
        public void metode() {
            System.out.println("Sóc un mètode d'una classe anònima!!");
        }

        @Override
        public int metode2(float f) {
            return 0;
        }
    };

    Interficie prop2=new EnNom();

    public static void main(String[] args) {
        ClassesAnonimes obj=new ClassesAnonimes();
        obj.prop.metode();
        obj.prop2.metode();

        System.out.println(obj.prop.getClass().getName());
        System.out.println(obj.prop2.getClass().getName());
    }


}

class EnNom implements Interficie{

    @Override
    public void metode() {
        System.out.println("Sóc un mètode d'una classe en nom que implementa la interfície");
    }

    @Override
    public int metode2(float f) {
        return 0;
    }


}

interface Interficie{
    void metode();

    int metode2(float f);
}


