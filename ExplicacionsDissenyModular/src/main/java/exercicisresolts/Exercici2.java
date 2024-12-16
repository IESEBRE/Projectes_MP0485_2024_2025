package exercicisresolts;

import java.util.Random;
import java.util.Scanner;

public class Exercici2 {

    public static void main(String[] args) {

        int quantitat=obtenirEnterMajorOIgual("Digues quants caràcters vols vore:" ,
                "Ha de ser major o igual que 1!!",1);

        mostraVarisCaracters(quantitat);

    }

    /**
     * Prints a sequence of randomly generated characters to the console.
     * The number of characters printed is determined by the input parameter.
     *
     * @param numCaracters the number of random characters to generate and display
     */
    public static void mostraVarisCaracters(int numCaracters){

        for (int i = 0; i < numCaracters; i++) {
            System.out.format("%c", retornaCaracter());
        }
    }

    public static char retornaCaracter() {
        //Generem un caracter aleatori entre ' ' i '}'
        Random r=new Random();
        return (char)(r.nextInt('}'-' '+1)+' ');
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


}
