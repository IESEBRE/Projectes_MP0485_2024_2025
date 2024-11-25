package problemesjoel;

import java.util.Scanner;

public class DiadaCastellera {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        //Declaració de variables
        int dA, dB, dBoo, dMil;
        dA=dB=dBoo=dMil=0;
        boolean error=false;

        while (numCasos-- > 0) {
            //Tractament de cada cas
            //Tractem els 8 números
            for (int i = 1; i <=4 ; i++) {
                int intentats=ent.nextInt();
                int d=ent.nextInt();
                if(intentats<d) error=true;  //marquem que hi ha hagut un error
                switch(i){      //Tractem cada parella de números mirant el valor d'i
                    case 1: dA+=d; dBoo+=d; break;
                    case 2: dA+=d; dMil+=d; break;
                    case 3: dB+=d; dBoo+=d; break;
                    case 4: dB+=d; dMil+=d; break;
                }
            }
        }

        //Mostrem el resultat
        System.out.println(error?"ERROR":( dA>dB ? "A" : "B" )+"\n"+( dBoo > dMil ? "BOOMERS" : "MILENIALS"));
    }
}
