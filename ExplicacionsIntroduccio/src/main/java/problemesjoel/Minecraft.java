package problemesjoel;

import java.util.Scanner;

public class Minecraft {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            int numPas = ent.nextInt();
            int comptTrobats=0;

            while (numPas-- > 0) {
                //Tractament de cada cas
                String passadis=ent.skip("[\n\r]*").nextLine();
                int index=0;
                do {
                    index=passadis.indexOf("{}", index);
                    if(index!=-1){
                        comptTrobats++;
                        index+=2;
                    }else break;
                }while(true);
            }
            //Imprimim el resultat del cas actual
            System.out.println(comptTrobats);
        }


    }
}
