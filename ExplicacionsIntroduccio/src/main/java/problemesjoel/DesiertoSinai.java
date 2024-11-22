package problemesjoel;

import java.util.Scanner;

public class DesiertoSinai {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            int mapes=ent.nextInt();
            if(mapes<1){
                System.out.println();
                continue;
            }
            String[] noms=new String[mapes];    //per guardar els noms dels mapes
            int[] vots=new int[mapes];          //per comptar els vots
            //Llegim i tractem cada mapa
            for (int i = 0; i < mapes; i++) {
                //Llegim nom de mapa
                String mapa=ent.skip("[\r\n]*").nextLine();
                //Busquem si ja el tenim al vector de noms
                int j=0;
                for (; j < mapes && noms[j]!=null && !noms[j].equals(mapa); j++);
                //Si hem trobat una casella a null significa que és el primer vot del mapa, i guardem el seu nom
                if(noms[j]==null) noms[j]=mapa;
                //Incrementem el número de vots del mapa
                vots[j]++;
            }
            //Busquem quin és el que té més vots i la seua posició
            int maxValor=0, maxIndex=-1;
            for (int i = 0; i < mapes && noms[i]!=null; i++) {
                //Si trobem un mapa en més vots actualitzem
                if(maxValor<vots[i]){
                    maxValor=vots[i];
                    maxIndex=i;
                }
            }
            //Mostrem el nom del mapa en més vots
            System.out.println(noms[maxIndex]);
        }
    }
}
