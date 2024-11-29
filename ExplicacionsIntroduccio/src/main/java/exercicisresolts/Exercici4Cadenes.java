package exercicisresolts;

import java.util.Scanner;

public class Exercici4Cadenes {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String text="", linia;
        int comptLinies=0, comptCars=0;

        //Sumen els valors fins introduir un 0 --> concatenar lńies fins trobar una cabada en punt
        System.out.println("Escriu un text format per una o més línies i acabat en una línia que ha de contindre el punt:");
        do{
            linia=ent.nextLine().trim();
            comptLinies++;
            //Comptem quants espàis en blanc conté la línia --> usem indeOf dins d'un bucle
            int pos=0, comptadorBlancs=0;
            do {
                pos = linia.indexOf(" ", pos);
                if (pos != -1) {
                    comptadorBlancs++;
                    pos++;
                }
                else break;
            }while(true);
            comptCars+=linia.length()-comptadorBlancs;
            if(!linia.contains(".")) text=text+linia+"\n";
            else text=text+linia;
        }while(!linia.contains("."));

        System.out.println("El text introduït és:\n"+text+"\n");
        System.out.format("El text conté %d línies i %d caràcters.", comptLinies, comptCars);
    }
}
