package problemesjoel;

import java.util.Scanner;

public class ComptadorNotes {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int compt, cMDs, cIs, cSs, cBs, cNs, cEs;
        compt=cMDs=cIs=cSs=cBs=cNs=cEs=0;
        int sumaNotes=0;

        //Llegim la primera nota
        int nota=ent.nextInt();

        //Bucle per llegir les notes restants
        while(nota!=-1){
            //Tractem la nota que acabem de llegir
            if(nota>=0 && nota<=10){
                compt++;
                sumaNotes+=nota;
                if(nota<=3) cMDs++;
                else if(nota<5) cIs++;
                else if(nota<6) cSs++;
                else if (nota<7) cBs++;
                else if (nota<9) cNs++;
                else cEs++;
            }
            //Llegim la següent nota
            nota=ent.nextInt();
        }

        //Mostrem el resultat
        System.out.println("NOTES: "+compt+" MITJANA: "+((float)sumaNotes/compt)+" E: "+cEs+" N: "+cNs+" B: "+cBs+" S: "+cSs+" I: "+cIs+" MD: "+cMDs);
    }
}
