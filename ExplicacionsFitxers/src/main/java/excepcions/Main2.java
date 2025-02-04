package excepcions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int num=0;
        boolean esText=true;

        do{
            System.out.println("Escriu un número enter major que 0:");
            try{
                esText=true;
                num=ent.nextInt();
                if(num>0) break;
                esText=false;
                throw new InputMismatchException();
            }catch(InputMismatchException e){
                System.out.println("Has escrit un número incorrecte!!");
                if(esText) ent.next();
            }
        }while(true);

        System.out.println(num);
    }
}