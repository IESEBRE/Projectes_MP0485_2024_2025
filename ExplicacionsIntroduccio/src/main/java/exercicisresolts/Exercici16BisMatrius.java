package exercicisresolts;

import java.util.Random;
import java.util.Scanner;

public class Exercici16BisMatrius {

    public static void main(String[] args) {
        //variables necessàries
        Scanner ent = new Scanner(System.in);
        Random r=new Random();
        int[][] m=new int[5][10];   //ha de ser de 5 x 10
        int[] aparicions;           //encara no sabem quantes caselles ha de tindre
        int inf, sup;               //límits del rang
        //1. Llegir el rang
        //1.1. Llegim el valor inferior
        do{
            System.out.println("Escriu un enter major o igual que 0:");
            inf=ent.nextInt();
            if(inf<0) System.out.println("Ha de ser major o igual que 0!");
            else break;
        }while(true);
        //1.2. Llegim el valor superior
        do{
            System.out.println("Escriu un segon enter major o igual que 0:");
            sup=ent.nextInt();
            if(sup<0) System.out.println("Ha de ser major o igual que 0!");
            else break;
        }while(true);
        //1.3. Comparació dels 2 valors i, si cal, intercanvi
        if(inf>sup){                //si l'inferior és major que el superior intercanviem els valors
            int temp=inf;
            inf=sup;
            sup=temp;
        }

        //1.4. Aquí segur que inf<=sup, per tant ja podem generar el rang de valor
        aparicions=new int[sup-inf+1];

        //2. Omplim matriu i comptem aparacions dels números del rang
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j]=r.nextInt(sup-inf+1)+inf;
                System.out.format("%5d", m[i][j]);
                aparicions[m[i][j]-inf]++;
            }
            System.out.println();
        }
        //3. Mostrem les aparicions de cada número del rang
        System.out.println();
        for (int i = 0; i < aparicions.length; i++) {
            System.out.format("El valor %d ha sortit %d vegades.%n", i+inf, aparicions[i]);
        }




    }


}
