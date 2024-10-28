package exercicisresolts;

import java.util.Scanner;

public class Exercici13CadenesSenseSplit {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String text;
        int ini=0;

        //Demanem el text a l'usuari
        do{
            System.out.println("Escriu una frase no buida:");
            text=ent.nextLine().trim();
            if(text.isBlank()) {
                System.out.println("T'he dit que no pot ser buida!!");
                continue;
            }
            break;
        }while(true);

        //Anem el recorrer el text retallant les paraules que conté (buscant espais en blanc)
        do{
            int fi=text.indexOf(' ', ini);

            if(ini==fi) {
                ini++;
                continue;
            }

            if(fi!=-1)  //hem trobat un espai en blanc
                System.out.println(text.substring(ini, fi));
            else {//no hem trobat cap espai en blanc, per tant estem al final de la frase
                System.out.println(text.substring(ini));
                break;
            }
            ini=fi+1;
        }while(true);
    }

}
