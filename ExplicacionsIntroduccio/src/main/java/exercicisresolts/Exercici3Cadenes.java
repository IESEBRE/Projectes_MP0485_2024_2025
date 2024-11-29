package exercicisresolts;

import java.util.Scanner;

public class Exercici3Cadenes {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String text="", linia;
        int comptLinies=0;

        //Sumen els valors fins introduir un 0 --> concatenar lńies fins trobar una cabada en punt
        System.out.println("Escriu un text format per una o més línies i acabat en punt:");
        do{
            linia=ent.nextLine();
            if(!linia.isBlank()) comptLinies++;     //!linia.trim().isEmpty() o linia.trim().length()!=0
            if(!linia.endsWith(".")) text=text+linia+"\n";
            else text=text+linia;
        }while(!linia.endsWith("."));

        System.out.println(text);
        System.out.format("El text conté %d línies no buides.", comptLinies);
    }
}
