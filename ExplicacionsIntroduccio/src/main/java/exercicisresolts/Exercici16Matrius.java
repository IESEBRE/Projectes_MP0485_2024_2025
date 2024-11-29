package exercicisresolts;

import java.util.Random;

public class Exercici16Matrius {

    public static void main(String[] args) {
        Random r=new Random();
        int[][] matriu=new int[5][10];  //no cal matriu, però en este cas l'usem
        int[] sumaFiles=new int[5];     //vector en 5 caselles --> tenim 5 files
        int[] sumaColumnes=new int[10];//vector en 10 caselles --> tenim 10 columnes

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j]=r.nextInt(101);        //generem números aleatoris de 0 a 100
                sumaFiles[i]+=matriu[i][j];               //sumem la casella actual a la fila i
                sumaColumnes[j]+=matriu[i][j];            //sumem la casella actual a la columna j
                System.out.format("%4d", matriu[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        //Mostrem la suma de files
        System.out.println("Vector en la suma de les files:");
        for (int i = 0; i < sumaFiles.length; i++) System.out.format("%4d", sumaFiles[i]);
        System.out.println();

        //Mostrem la suma de columnes
        System.out.println("Vector en la suma de les columnes:");
        for (int i = 0; i < sumaColumnes.length; i++) System.out.format("%4d", sumaColumnes[i]);
    }
}
