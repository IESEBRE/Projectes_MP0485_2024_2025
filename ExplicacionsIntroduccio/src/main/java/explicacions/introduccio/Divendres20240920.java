package explicacions.introduccio;


import java.util.Scanner;

//Esta és la classe principal del fitxer .java
public class Divendres20240920 {

    public static void main(String[] args) {
        System.out.println("Hola món!");    //"Hola món!" és una cadena de text, String
        System.out.println(446);             //44 és un número enter, short byte int long
        System.out.println(44.89);          //44.89 és un número decimal o real, float double
        System.out.println(true);           //true és un valor booleà, boolean
        System.out.println('a');            //'a' és un caràcter, char
    }
}

class Segona{

    public static void main(String[] args) {

        //Declaració de variables
        int numero;
        double sou;
        boolean casat;

        sou=1000;
        System.out.println(sou);

    }
}

class Tercera{

    public static void main(String[] args) {

        //Lectura de dades des del teclat
        Scanner ent = new Scanner(System.in);

        //Declaració de variables
        int edat;
        double _1Sou, classe;

        //Anem a demanar l'edat a l'usuari
        System.out.println("Quina edat tens?");
        edat=ent.nextInt();

        

        //Mostrem l'edat
        System.out.println("Tens "+edat+" anys.");

        //Mostrem l'edat que tindrà l'any que ve
        System.out.println("L'any que ve tindràs "+(edat+1)+" anys.");

    }

}
