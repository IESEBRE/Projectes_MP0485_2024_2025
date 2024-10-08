package problemesjoel;

import java.util.Scanner;

public class PlatanBananaV2 {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);

        //Comptadors de platans i bananes
        int comptB=0, comptP=0;

        char inicial = ent.nextLine().charAt(0);    //controladora del bucle

        while(inicial != '0'){
            //Com estem dins del bucle linia valdrà P o B
            if(inicial == 'P') comptP++;
            else comptB++;

            //LLegim la inicial de la següent línia de text
            inicial = ent.nextLine().charAt(0);
        }

        //El resultat l'obtenim comparant els comptadors
        if(comptB == comptP) System.out.println("No puc distingir entre un platan i una banana");
        else System.out.println(comptB > comptP ? "M'agraden les bananes":"M'agraden els platans");

    }
}
