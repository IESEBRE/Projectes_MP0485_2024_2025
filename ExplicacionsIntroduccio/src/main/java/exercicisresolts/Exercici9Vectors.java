package exercicisresolts;

import java.util.Random;
import java.util.Scanner;

public class Exercici9Vectors {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Random r=new Random();
        int num=0;
        int[] comptador=new int['Z'-'A'+1];

        //Demanem el número positiu a l'usuari
        do{
            System.out.println("Introduix un número enter positiu:");
            num=ent.nextInt();
            if(num<=0) System.out.println("El número ha de ser major que 0!!");
            else break;
        }while(true);

        //generem les lletres aleatòriament
        for (int i = 0; i < num; i++) {
            int lletra=r.nextInt('Z'-'A'+1)+'A';
            System.out.format("%c",(char)lletra);
            comptador[lletra-'A']++;        //generem l'index del vector a partir de la lletra apareguda
        }
        System.out.println();

        //Mirem quines lletres han sortit i quantes vegades
        for (int i = 0; i < comptador.length; i++) {
            if(comptador[i]>0)
                System.out.format("La lletra %c ha sortit %d vegades.%n",(char)(i+'A'),comptador[i]);     //generem  la lletra a partir de  l'index aparegut
        }
    }


}
