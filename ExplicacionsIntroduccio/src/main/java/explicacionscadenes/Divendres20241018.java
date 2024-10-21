package explicacionscadenes;

import java.util.Scanner;

public class Divendres20241018 {

    public static void main(String[] args) {
        Divendres20241018 objecte = new Divendres20241018();
        Scanner ent = new Scanner(System.in);
        //ent = System.in;
        String cadena = new String("Sóc un text");
        String cadenaRep = "Sód un text";
        System.out.println(cadena.charAt(0));
        System.out.println(cadena.charAt(10));
        //System.out.println(cadena.charAt(55));

        if(cadena.equals(cadenaRep)) System.out.println("Són iguals");

        if(cadena.compareTo(cadenaRep)==0) System.out.println("Són iguals");
        else if(cadena.compareTo(cadenaRep)<0) System.out.println("La primera és menor que la segona");
        else System.out.println("La primera és major que la segona");

        System.out.println(cadena.compareTo(cadenaRep));



        if(cadena.startsWith("S")) System.out.println("El text comença en S");
        else System.out.println("El text no comença en S");
    }
}

class StringII{

    public static void main(String[] args) {
        String text="jfkdajfkkdjfksdfjksdkfjksadfjaskdfjkfkdsfjiasdjfk";
        int compt=0;

        //recorrem el text d'esquerra a dreta
        int index=text.indexOf('a'); //comença buscar a partir de la posició 0

        //Volem comptar 'a's
        while(index!=-1) {
            compt++;
            System.out.println("S'ha trobat una aparició a la posició "+index);
            index=text.indexOf('a',index+1);
        }
        System.out.println("Hem trobat "+compt+" 'a's");

        //Ara recorrem de dreta a esquerra
        compt=0;
        index=text.lastIndexOf('a'); //comença buscar a partir de la posició text.length()-1

        //Volem comptar 'a's
        while(index!=-1) {
            compt++;
            System.out.println("S'ha trobat una aparició a la posició "+index);
            index=text.lastIndexOf('a',index-1);
        }
        System.out.println("Hem trobat "+compt+" 'a's");
    }
}


class StringIII{

    public static void main(String[] args) {

        String text="12,34,56,9,-1";
        String[] paraules=text.split(",");          //vector o array d'Strings
        int[] numeros = new int[paraules.length];           //declaro un array d'enters de la mateixa longitud que el de dalt
        int suma=0;

        //Vaig a recorrer les caselles de l'array
        for (int i = 0; i < paraules.length; i++) {
            System.out.println( paraules[i] );
            numeros[i]=Integer.valueOf(paraules[i]);
            suma+=Integer.valueOf(paraules[i]);
        }
                
    }




}