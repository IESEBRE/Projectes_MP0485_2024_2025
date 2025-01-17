package com.iesebre.library20242025;

import java.util.Scanner;

public class Numero {

    /**
     * Genera un número enter inferior al que rebem com a paràmetre i major o igual que 0
     * @param text un text que diu el que hem de fer
     * @param num el valor superior a introduir
     * @return retorna un enter entre 0 i num menys 1
     */
    public static int demanaValor(String text, int num){
        Scanner entrada=new Scanner(System.in);
        int valor;
        do{
            System.out.format("\nIntroduix %s a consultar (0-%d):\n", text,num-1);
            valor=entrada.nextInt();
        }while(valor<0 || valor>=num);

        return valor;
    }

    /**
     * Retorna la suma dels n primers números naturals
     * @param n un número enter
     * @param recursiu si volem usar la versió recursiva o iterativa
     * @return la suma dels n primers numeros naturals, o -1 si n és mneor que 0
     */
    public static int sumaNaturals(int n, boolean recursiu){
        //Casos no recursius o de parada
        if(n<0) return -1;
        if(n==0) return 0;

        if(recursiu){

            //Cas recursiu
            return n+sumaNaturals(n-1, true);
        }else{
            int suma=0;
            while(n>0){
                suma+=n;
                n--;
            }
            return suma;
        }
    }

    /**
     * Obté els dígits d'un número i els guarda dins d'un vector
     * @param numero un valor enter positiu, negatiu o 0
     * @return un vector d'enters de la mida exacta contenint els dígits del número. Si el número és negatiu la primera
     * casella del vector serà negativa i la resta positives
     */
    public static int[] vectorDigits(int numero){
        //Mirem si el numero és negatiu, i en en cas afirmatiu m'ho apunto i el passo a positiu
        boolean negatiu=numero<0;
        if(negatiu) numero*=-1;     //si és negatiu lo passo a positiu

        //Calculem la llargada del número i instanciem el vector resultat
        int[] resultat=new int[Integer.toString(numero).length()];

        //Col·locar cada dígit del numero a la casella del vector corresponent (de dreta a esquerra)
        int index= resultat.length-1;
        while(numero!=0){
            resultat[index]=numero % 10;
            index--;
            numero/=10;
        }

        //Miro si el numero era negatiu i en cas afirmatiu canvio el siguen del primer dígit del vector
        if(negatiu) resultat[0]*=-1;
        return resultat;
    }

    /**
     * Obté el valor enter representat com a número dins d'un vector
     * @param numero vector que conté els dígits d'un número. Han de ser o tots positius, o el primer negatiu i la resta positius
     * @return el valor enter representat dins del vector, o 0 si rebem un null o un vector buit
     */
    public static int numVector(int[] numero){
        //Tractament de casos especials del paràmetre
        if(numero==null || numero.length==0) return 0;

        //Mirem si el numero és negatiu, i en en cas afirmatiu m'ho apunto i el passo a positiu
        boolean negatiu=numero[0]<0;
        if(negatiu) numero[0]*=-1;     //si és negatiu lo passo a positiu

        //Col·locar cada dígit del numero a la casella del vector corresponent (de dreta a esquerra)
        int index= numero.length-1;
        int pot10=1;
        int resultat=0;
        while(index>=0){
            resultat+=numero[index] * pot10;
            index--;
            pot10*=10;
        }

        return resultat*(negatiu?-1:1);

    }


}
