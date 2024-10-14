package explicacions.introduccio;

import java.util.Scanner;

public class Dilluns20241014 {

    public static void main(String[] args) {

        //2ª estructura repetitiva --> el for
        String text="Poso un text fix";

        //Vull recorrer el text
        int index=0;        //Index inicialitzat a 0
        while(index<text.length()){

            //Accedim al text
            System.out.println(text.charAt(index));

            //Incremento l'índex
            index++;
        }

        //Fem el for equivalent
        for(int i=0; i<text.length() ; i++){
            //Accedim al text
            System.out.println(text.charAt(i));
        }

        //Un for més complicat
        for(int j=0, k=1; j<56 && k%234!=0 ; j++, k=k-4){
            System.out.println(j*k);
        }

    }
}


class RepetitivaIII{

    public static void main(String[] args) {
        //Programa que demana a l'usuari la introducció d'un número enter
        //i el mostra per pantalla. Acabarem quan rebem un 0, que també mostrem
        Scanner ent = new Scanner(System.in);
        int num;

//        System.out.println("Introduix un enter (0 per acabar):");
//        num= ent.nextInt();
//        System.out.println(num);

        //El do_while és útil quan el cos del bucle s'ha d'executar com a mínim una vegada
        do {
            System.out.println("Introduix un enter (0 per acabar):");
            num = ent.nextInt();
            System.out.println(num);
        } while(num!=0);

    }





}
