package exercicisresolts;

import java.util.Scanner;

public class ComptarLletres {

    //Fer un programa que llig un text format per una sola línia i en minúscules, i sense accents,
    // i a continuació diu quantes lletres vocals i consonants conté
    //Per simplificar només escriure vocals, consonants i espais en blanc
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Escriu un text:");
        String text=ent.nextLine();

        int compV, compC, index;
        index=compV=compC=0;

        //Recorrem el text
        while(index<text.length()){
            char c=text.charAt(index);
            if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u') compV++;
            else if(c!=' ') compC++;

            index++;
        }

        System.out.println("S'han trobat "+compV+" vocals i "+compC+" consonants.");
    }

}
