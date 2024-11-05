package problemesjoel;

import java.util.Scanner;

public class TenRecordesDeLlegintCasellaAMostrarAbansQueVector {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            int k=ent.nextInt();
            //Llegim la posició a mostrar
            int p=ent.nextInt();

            //Tractem els valors rebuts
            for (int i = 0; i < k; i++) {
                int valor=ent.nextInt();
                //mostrem el resultat si estem llegint el valor p-essim
                if(i==p) System.out.println(valor);
            }

        }
    }

}
