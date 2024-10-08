package problemesjoel;

import java.util.Scanner;

public class PlatanBanana {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);

        //Comptadors de platans i bananes
        int comptB=0, comptP=0;
        String linia=ent.nextLine();    //controladora del bucle

        while(!linia.equals("0")){
            //Com estem dins del bucle linia valdrà P o B
            if(linia.equals("P")) comptP++;
            else comptB++;

            //LLegim la següent línia de text
            linia=ent.nextLine();
        }

        //El resultat l'obtenim comparant els comptadors
        if(comptB == comptP) System.out.println("No puc distingir entre un platan i una banana");
        else System.out.println(comptB > comptP ? "M'agraden les bananes":"M'agraden els platans");

    }
}
