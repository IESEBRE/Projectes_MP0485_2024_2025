package exercicisresolts;

import java.util.Random;

public class Exercici17MatriusSolucio2 {

    public static void main(String[] args) {
        int[][] m=new int[5][5];
        Random r=new Random();

        //generem la matriu aleatòriament
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.format("%3d", m[i][j]=r.nextInt(10));
            }
            System.out.println();
        }
        System.out.println();

        //anem a calcular suma dels veïns
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                //Tractament de la casella actual
                int suma = 0;
                for (int k = i-1; k <= i+1 ; k++) {
                    for (int l = j-1; l <=j+1 ; l++) {
                        if(k>=0 && k<m.length && l>=0 && l<m[k].length) suma+=m[k][l];
                    }
                }
                System.out.format("%3d", suma-m[i][j]);
            }
            System.out.println();
        }


    }
}






//int suma = (i>0 && j>0 ? m[i-1][j-1] : 0) + (i>0 ? m[i-1][j]:0) + (i>0 && j<m[i].length-1 ? m[i-1][j+1]:0) + (j>0 ? m[i][j-1]:0)+ (j<m[i].length-1 ? m[i][j+1]:0) +
//        (i<m.length-1 && j>0 ?m[i+1][j-1]:0) + (i<m.length-1 ? m[i+1][j]:0 )+ (i<m.length-1 && j<m[i].length-1 ? m[i+1][j+1]:0);