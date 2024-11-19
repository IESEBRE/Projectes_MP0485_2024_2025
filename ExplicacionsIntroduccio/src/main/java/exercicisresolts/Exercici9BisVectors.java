package exercicisresolts;

import java.util.Random;
import java.util.Scanner;

public class Exercici9BisVectors {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Random r=new Random();
        int num=0;
        int[] comptador=new int['Z'-'A'+1];
        char[] entrada;                         //declaro un vector on guardaré l'entrada. No l'instàncio pk no sé quantes caselles necessitaré
        boolean[] tractades=new boolean['Z'-'A'+1];  //vector per saber si hem tractat una lletra o no
        //Demanem el número positiu a l'usuari
        do{
            System.out.println("Introduix un número enter positiu:");
            num=ent.nextInt();
            if(num<=0) System.out.println("El número ha de ser major que 0!!");
            else break;
        }while(true);
        entrada=new char[num];      //Ara que sé quantes caselles necessityo instancio el vector

        //generem les lletres aleatòriament
        for (int i = 0; i < num; i++) {
            int lletra=r.nextInt('Z'-'A'+1)+'A';
            System.out.format("%c",(char)lletra);
            comptador[lletra-'A']++;        //generem l'index del vector a partir de la lletra apareguda
            entrada[i]=(char)lletra;
        }
        System.out.println();

        //Mostrem quantes vegades han aparegut les lletres de l'entrada, evitant repeticions
        for (int i = 0; i < entrada.length; i++) {
            //Per evitar repeticions mirarem el contingut del vector de lletres tractades
            if(!tractades[entrada[i]-'A']) {
                System.out.format("La lletra %c ha sortit %d vegades.%n", entrada[i], comptador[entrada[i] - 'A']);     //generem  la lletra a partir de  l'index aparegut
                tractades[entrada[i]-'A']=true;
            }
        }
    }


}
