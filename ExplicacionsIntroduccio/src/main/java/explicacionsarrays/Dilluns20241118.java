package explicacionsarrays;

import java.util.Random;

public class Dilluns20241118 {

    public static final int NUMCARES=6;     //Constnat de Java

    public static void main(String[] args) {
        Random r=new Random();
        int[] comptadorCares = new int[NUMCARES];  //comptarem cada cara

        //Simulem que tirem el dau 100 vegades
        for (int i = 0; i <100 ; i++) {
            int index=r.nextInt(NUMCARES);
            comptadorCares[index]++;
        }

        //Mirem quantes vegades ha sortit cada cara
        for (int i = 0; i < NUMCARES; i++) {
            System.out.format("La cara %d ha sortit %d vegades.%n", i+1, comptadorCares[i]);
        }
    }

}

class GeneraLletres{

    public static void main(String[] args) {
        Random r=new Random();

        System.out.format("%c%n",(char)(r.nextInt('z'-'A')+'A'));

        System.out.format("%c %d%n", 'a', (int)'a');
        System.out.format("%c %d%n", 'z', (int)'z');
        System.out.format("%c %d%n", 'A', (int)'A');
        System.out.format("%c %d%n", 'Z', (int)'Z');




    }



}
