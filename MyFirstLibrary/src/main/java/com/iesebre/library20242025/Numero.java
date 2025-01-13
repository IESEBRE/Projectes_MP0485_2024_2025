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
}
