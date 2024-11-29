package exercicisresolts;

import java.util.Scanner;

public class Exercici14Matrius {

    public static void main(String[] args) {

        //Demanem la dimensió de la matriu forçant a que sigue més gran que 0
        Scanner ent = new Scanner(System.in);
        int n;
        do{
            System.out.println("Quantes caselles vols usar? (>=1)");
            n= ent.nextInt();
            if(n<1) System.out.println("Ha de ser més que 0!!");
            else break;
        }while(true);

        //Mostrem el resultat
        char lletra='A';
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.format("%2c", lletra);
                //Fem que les lletres sempre siguen d'A a Z
                if(lletra=='Z') lletra='A';
                else lletra++;
            }
            System.out.println();
        }


    }


}
