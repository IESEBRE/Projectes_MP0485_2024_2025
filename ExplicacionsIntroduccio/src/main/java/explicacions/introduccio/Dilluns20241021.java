package explicacions.introduccio;

import java.util.Scanner;

public class Dilluns20241021 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int comptador=0;
        //Demanem frases a l'usuari i comptem les que comencen en 'a' o 'A'
        //Ha d'escriure Fi per acabar (o qualsevol variant en majuscules/minuscules)
        System.out.println("Introduix una frase (escriu Fi per acabar)");
        do{
            String frase=ent.nextLine().toUpperCase();  //Transforma el text llegit a majúscules
            if(frase.equalsIgnoreCase("FI")) break;
            if(frase.isBlank() || frase.charAt(0)!='A') continue;   //Important l'ordre de les expressions unides per ||
            //Increment que no està dins de cap condicional
            comptador++;
        }while(true);

        System.out.format("Has escrit %d línies que comencen per 'a' o 'A'%n", comptador);

    }

}

class Formateig{

    public static void main(String[] args) {
        String text="Soc un texta";

        for (int i = 0; i < text.length(); i++) {
            System.out.format("%c %1$C  %d %n",text.charAt(i), (int)text.charAt(i));
        }

        for (int i = 97; i < 130; i++) {
            System.out.format("%c %1$C  %1$d %n",i);

        }

    }

}

class FormateigII{

    public static void main(String[] args) {

        System.out.format("%+30.25f %n", Math.E);

    }
}
