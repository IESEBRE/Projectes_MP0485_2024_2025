package anidades;

public class Externa {

    //Propietats de la classe externa
    private int numero;

    void metode(){
        numero=1;
        System.out.println("Estic a la classe externa i el numero val "+numero);

    }

    //Classe anidada no èstàtica --> inner class
    public class Interna{

        //Propietats de la classe interna
        private int numero;

        void metode(){
            this.numero=23;
            System.out.println("Estic a la classe interna i el numero val "+numero);
        }
    }

    //Classe anidada estàtica
    protected static class Estatica{
        void metode(){
            //numero=23;
            System.out.println("Estic a la classe anidada estàtica i no sé que és el numero");
        }
    }
}

class SimilarAEstatica{
    void metode(){
        //numero=23;
        System.out.println("Estic a la classe normal i no sé que és el numero");
    }
}


class Prova{

    public static void main(String[] args) {
        //Instanciem un objecte de la classe Estatica
        Externa.Estatica objecte=new Externa.Estatica();
        objecte.metode();
        //Instanciem una classe d'una classe normal
        SimilarAEstatica obj2=new SimilarAEstatica();
        obj2.metode();
        //Instanciem un objecte de la classe interna
        Externa obj3=new Externa();
        obj3.metode();
        Externa.Interna obj4=obj3.new Interna();
        obj4.metode();

    }


}