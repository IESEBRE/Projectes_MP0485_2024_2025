package explicacions.introduccio;

import java.util.Scanner;

public class Dilluns20241007 {

    public static void main(String[] args) {

        //while(condició certa){
            //instruccions a repetir
        //}

        int control=0;

        while( control <= 10) {
            System.out.println("Estic dins del bucle!!");
            System.out.println(control);
            control++;
        }


    }
}

class WhileII{

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int control=0;

        while(control != 24) {
            System.out.println("Endevina el número per sortir:");
            control = ent.nextInt();
        }
    }

}