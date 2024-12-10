package introduccio;

import java.util.Random;

public class Dimarts20241203 {

    public static void main(String[] args) {



        noRetornoRes(' ');      //crida passant una constant char ' ' al mètode
        char l='i', caracter='j';       //paràmetres reals
        noRetornoRes(l);
        noRetornoRes(caracter);
    }

    public static char retornaCaracter(){

        if(true) return ' ';
        else return ' ';
    }

    public static void noRetornoRes(char caracter){         //caracter és un paràmetre formal
        int l=99;
        //Si el paràmetre és el espai sortim sense fer res
        if(caracter==' ') return;
        System.out.println("El valor del paràmetre és "+caracter);

        if(caracter!=' ') System.out.println("El valor del paràmetre és "+caracter);

        {
            int esticDinsDelBloc=55;
            System.out.println(esticDinsDelBloc);
            l=55;
            System.out.println(l);
        }
        //System.out.println(esticDinsDelBloc); --> no podem usar la variable ja que estem foira del seu àmbit o bloc
    }
}

class PasDeParametres{

    public static void main(String[] args) {
        boolean real=true;
        tincUnParametre(real);
        System.out.println(real?"CERT":"FALS");

        boolean[] realTipoArrayBoolean=new boolean[]{true};
        tincUnParametre(realTipoArrayBoolean);
        System.out.println(realTipoArrayBoolean[0]?"CERT":"FALS");
    }


    public static void tincUnParametre(boolean param){
        param=!param;       //canviem el valor del paràmetre de true afgalse o viceversa
    }

    public static void tincUnParametre(boolean[] parame){
        if(parame==null || parame.length==0) return;
        parame[0]=!parame[0];       //canviem el valor del paràmetre de true afgalse o viceversa
    }

}

class PasDeParametres2{

    public static void main(String[] args) {
        int i;
        UnaPropietat pollo=new UnaPropietat();
        pollo.propietat=2024;

        for (i = 1; i <= 20; i++) {
            System.out.println("Estem a l'execució número "+i);
            i=metodeNaive(i);
            System.out.println("La propietat del pollo val "+pollo.propietat);
            metodeNaive(pollo);

        }
    }

    public static int metodeNaive(int i) {
        Random r=new Random();
        i=r.nextInt();
        return i;
    }

    public static void metodeNaive(UnaPropietat objecte) {
        Random r=new Random();
        objecte.propietat=r.nextInt(2025);
    }

}

//POJO: Plain Old Java Object
class UnaPropietat{
    int propietat;
}