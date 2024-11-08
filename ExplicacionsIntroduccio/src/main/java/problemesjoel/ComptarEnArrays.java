package problemesjoel;

import java.util.Scanner;

public class ComptarEnArrays {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            int k= ent.nextInt();
            int[] vector=new int[k];

            for (int i = 0; i < vector.length; i++) {
                vector[i]=ent.nextInt();
            }

            int buscat=ent.nextInt();
            int comptador=0;

            for (int i = vector.length-1; i >= 0; i--) {
                if(vector[i]==buscat) comptador++;  //comptador+=(vector[i]==buscat ? 1:0)
            }

            System.out.println(comptador);
        }


    }
}
