package introduccio;

import java.util.Random;
import java.util.Scanner;

public class Dilluns20241202 {

    //Ha de mostrar un missatge Hello World i assignar un valor aleatori a una variable
    public static void main(String[] args) {
//        //Declaració de variables del main
//        Scanner ent = new Scanner(System.in);
//        int variable;
//
//        //Anem a recorrer els args
//        for (int i = 0; i < args.length; i++) {
//            if(args[i].equals("Avui")) System.out.println("Okay");
//            else System.out.println(args[i]);
//        }
//
//        //Cridem al mètode de baix
//        metodeDibuixar();
//
//        //Cridem al mètode que genera valor aleatori
//        System.out.println("Introduix el límirt de números aleatoris:");
//        int i=ent.nextInt();
//        variable=generaNumeroAleatori(i);
//        System.out.format("El número aleatori generat és el %d%n", variable);
//
        //Anem a generar números aleatoris
        int limit=7;
        int[] resultat=generateRandomNumbers(25, limit);
        if(resultat!=null)
            for (int i = 0; i < resultat.length; i++) {
                System.out.println(resultat[i]);
            }
        else System.out.println("No s'han pogut generar els números ja que el límit val "+limit);

    }

    //Anem a crear un nou mètode
    public static void metodeDibuixar(){
        //Codi del mètode
        System.out.println("Hello world inside a method!");
    }

    //Mètode que retorna qualsevol número enter correcte
    public static int generaNumeroAleatori(){
        Random r=new Random();
        return r.nextInt();
    }

    //Mètode que retorna un número enter entre 0 i el paràmetre menys 1 si és paràmetre és coorecte i sinó retorna -1
    public static int generaNumeroAleatori(int limit){
        if(limit<0) return -1;
        Random r=new Random();
        int valor;
        return r.nextInt(limit);
    }

    //Mètode que retorna 3 números enters aleatoris
    public static int[] generateRandomNumbers(int bound){
        Random r=new Random();
        int[] valor=new int[3];

        //Generem els 3 números aleatoris
        valor[0]=r.nextInt(bound);
        valor[1]=r.nextInt(bound);
        valor[2]=r.nextInt(bound);

        return valor;
    }

    public static int[] generateRandomNumbers(int bound, int quantitat) {

        if(quantitat<0 || bound<0) return null;
        Random r=new Random();
        int[] valor=new int[quantitat];

        //Generem els números aleatoris
        for (int i = 0; i < valor.length; i++) {
            valor[i]=r.nextInt(bound);
        }
        return valor;
    }
}
