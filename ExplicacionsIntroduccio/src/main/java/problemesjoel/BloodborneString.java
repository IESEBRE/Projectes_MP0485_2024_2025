package problemesjoel;

import java.util.Scanner;

public class BloodborneString {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            String paraula= ent.skip("[\r\n]*").nextLine().toLowerCase();
            boolean trobat=false;

            //Tractem la paraula
            for (int i = 0; !trobat && i + 1 < paraula.length(); i++) {
                if(paraula.charAt(i)==paraula.charAt(i+1)) trobat=true;
            }

            //Mostrem el resultat
            System.out.println(trobat?"SI":"NO");

        }
    }
}
