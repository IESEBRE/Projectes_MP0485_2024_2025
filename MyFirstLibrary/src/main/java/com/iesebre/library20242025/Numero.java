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

}
