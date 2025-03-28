package anidades;


import java.util.Random;

//Les interfícies que només tenen un mètode s'anomenen FUNCIONALS
interface Funcional{
    boolean esCert();
}

interface Funcional2{
    int donamUnNumero(int limit);
}


public class ExpressionsLambda {

    static final Funcional2 prop= new Funcional2() {
        @Override
        public int donamUnNumero(int limit) {
            return limit-23;
        }
    };

    static final Funcional2 prop2=
            (limit) -> {
                            return limit-23;
            };

    static void metode(Funcional f){
        if(f.esCert()) System.out.println("És cert!!");
        else System.out.println("És fals!!");
    }

    public static void main(String[] args) {
        metode(new Funcional() {
            @Override
            public boolean esCert() {
                Random r=new Random();
                return r.nextInt()%2==0;
            }
        });

        metode( () -> {
            Random r=new Random();
            return r.nextInt()%2==0;
        });


    }
}
