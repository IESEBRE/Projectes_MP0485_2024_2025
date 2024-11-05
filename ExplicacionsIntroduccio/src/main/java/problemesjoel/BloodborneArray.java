package problemesjoel;

import java.util.Scanner;

public class BloodborneArray {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            int caselles=ent.nextInt();
            int[] vector=new int[caselles];     //Declarem un vector de "caselles" caselles enteres -> no té sentit fer-ho abans quan no sabiem quantes caselles necessitàvem


            //Omplim el vector
            for (int i = 0; i < caselles; i++) {
                vector[i]=ent.nextInt();
            }

            //Busquem si hi ha caselles repetides
            boolean trobat=false;
            for (int i = 0; !trobat && i + 1 < caselles; i++) {
                trobat= vector[i]==vector[i+1];
            }

            //Mostrem el resultat
            System.out.println(trobat?"SI":"NO");

        }
    }
}

//Recursos 0,212s, 40.24 MB
//Puntuación total: 4,00/4 (4.0/4 points)