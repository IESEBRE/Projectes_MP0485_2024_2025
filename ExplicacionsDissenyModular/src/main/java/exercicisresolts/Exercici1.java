package exercicisresolts;

import java.util.Random;
import java.util.Scanner;

public class Exercici1 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCaracters=0;

        //Forcem a que l'usuari escrigue un número major que 0
        do{
            System.out.println("Introduix un número major que 0:");
            numCaracters=ent.nextInt();
            if(numCaracters<1) System.out.println("Ha de ser major que 0!!");
            else break;
        }while(true);

        for (int i = 0; i < numCaracters; i++) {
            //Generem un caracter aleatori entre ' ' i '}'
            Random r=new Random();
            System.out.format("%c", (char)(r.nextInt('}'-' '+1)+' '));
        }
        System.out.println();
    }
}

class Exercici1Modular{

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCaracters=0;
        String caractersGenerats="";

        //Forcem a que l'usuari escrigue un número major que 0
        numCaracters = obtenirEnterMajorOIgual("Digues quants caracters vols vore:",
                "Ha de ser major o igual que 5!!",
                5);

        for (int i = 0; i < numCaracters; i++) {
            char generat=retornaCaracter();
            System.out.format("%c", generat);
            caractersGenerats+=generat;
        }
        System.out.println();
        
    }

    public static int obtenirEnterMajorOIgual(String instruccions, String informacioSiIncorrecte, int valorInicialMinim) {
        Scanner ent = new Scanner(System.in);
        int numCaracters;
        do{
            System.out.println(instruccions);
            numCaracters= ent.nextInt();
            if(numCaracters<valorInicialMinim) System.out.println(informacioSiIncorrecte);
            else break;
        }while(true);
        return numCaracters;
    }

    public static char retornaCaracter(char caracterMinim, char caracterMaxim) {
        //Primer comprovem si els paràmetres estan ordenats correctament, i sinó els intercanviem
        if(caracterMinim>caracterMaxim){
            char temp=caracterMinim;
            caracterMinim=caracterMaxim;
            caracterMaxim=temp;
        }
        //Generem un caracter aleatori entre ' ' i '}'
        Random r=new Random();
        return (char)(r.nextInt(caracterMaxim-caracterMinim+1)+caracterMinim);
    }

    public static char retornaCaracter() {
        //Generem un caracter aleatori entre ' ' i '}'
        Random r=new Random();
        return (char)(r.nextInt('}'-' '+1)+' ');
    }

}
