package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int num=0;

        do{
            System.out.println("Escriu un número enter qualsevol:");
            try{
                num=ent.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.println("Has escrit un número incorrecte!!");
                ent.next();         //evita bucle infinit, tarctant l'intro de l'anterior lectura
            }
        }while(true);




        System.out.println(num);
    }
}