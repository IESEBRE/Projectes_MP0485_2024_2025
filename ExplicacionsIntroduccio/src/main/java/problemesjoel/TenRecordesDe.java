package problemesjoel;

import java.util.Scanner;

public class TenRecordesDe {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            int k=ent.nextInt();
            int[] valors=new int[k];

            //Omplim el vector
            for (int i = 0; i < valors.length; i++) {
                valors[i]=ent.nextInt();
            }

            //Llegim la posició a mostrar
            int p=ent.nextInt();

            //mostrem el resultat
            System.out.println(valors[p]);
        }
    }

}
