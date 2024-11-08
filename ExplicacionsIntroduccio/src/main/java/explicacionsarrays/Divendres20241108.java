package explicacionsarrays;

import java.util.Scanner;

public class Divendres20241108 {

    public static void main(String[] args) {

        //declaració d'un array bidimensional --> matriu

        int[][] matriu;  //declaració d'una matriu
        Scanner ent = new Scanner(System.in);
        matriu=new int[2][3]; //instanciem una matriu de 4 files i 5 columnes

        //recorregut d'una matriu --> necessitem 2 fors anidats
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j]=ent.nextInt();
            }
        }

        //mostro el contingut de la matriu
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.format("%5d ",matriu[i][j]);
            }
            System.out.println();
        }

    }
}

class MatriuAmorfa{

    public static void main(String[] args) {

        int[][] matriu=new int[5][];  //instancio una matriu fixant el número de files, però sense dir quantes columnes tindrà

        matriu[0]=new int[4]; //instancio la primera fila en 4 columnes (caselles)
        matriu[1]=new int[1]; //instancio la segona fila en 1 columnes (caselles)
        matriu[2]=new int[0]; //instancio la terceraa fila en 0 columnes (caselles)
        matriu[3]=new int[2]; //instancio la cuarta fila en 2 columnes (caselles)
        matriu[4]=new int[3]; //instancio la quinta fila en 3 columnes (caselles)

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.format("%d ", matriu[i][j]);
            }
            System.out.println();
        }

    }




}
