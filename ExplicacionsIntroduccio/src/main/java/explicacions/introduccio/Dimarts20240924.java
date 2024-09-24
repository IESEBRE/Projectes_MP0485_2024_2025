package explicacions.introduccio;

import java.util.Scanner;

public class Dimarts20240924 {

    public static void main(String[] args) {

        int x=9, y=8;
        x = y + 1;
        x = x + y;
        x += y;

        x = x - y;  // x -= y;
        x = x * y;  // x *= y;
        x = x / y;  // x /= y;

        x = x + 1;
        x++;++x;
        x += 1;

        x = x - 1;
        x--;--x;
        x -= 1;
    }
}

class SentenciaCondicional1{

    public static void main(String[] args) {

        //La sentència if
        /*
        if(expr booleana){
            instruccions a executar si la expressió booleana és true
        }
        */
        Scanner ent = new Scanner(System.in);
        System.out.println("Quina és la teua edat?:");
        int edat=ent.nextInt();
        if(edat>=18){
            System.out.println("Ets major d'edat!!");
        }
    }
}

class SentenciaCondicional2{

    public static void main(String[] args) {

        //La sentència if else
        /*
        if(expr booleana){
            instruccions a executar si la expressió booleana és true
        } else {
            instruccions a executar si la expressió booleana és false
        }
        */
        Scanner ent = new Scanner(System.in);
        System.out.println("Quina és la teua edat?:");
        int edat=ent.nextInt();
        if(edat>=18){
            System.out.println("Ets major d'edat!!");
        } else {
            System.out.println("No ets major d'edat!!");
        }
// No usar la versió en 2 ifs ja que pot donar resultat diferent si no fem bé les condicions
//        if(edat>=18){
//            System.out.println("Ets major d'edat!!");
//        }
//        if(edat <= 18){
//            System.out.println("No ets major d'edat!!");
//        }
    }
}

class Variants{

    public static void main(String[] args) {

        int edat=18;

        //Si el bloc de l'if i/o else només té una instrucció, podem treure les { }
        if(edat>=18) System.out.println("Ets major d'edat");
        else System.out.println("No ets major d'edat");
    }


}