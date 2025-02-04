package excepcions;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int num=0;

        do{
            System.out.println("Escriu un número enter major que 0:");
            try{
                num=Integer.valueOf(ent.nextLine());
                System.out.println("Divisió de 10 el número introduït: "+ (10/num));
                if(num>0) break;
                throw new NumberFormatException();
            }catch(NumberFormatException e){
                System.out.println("Has escrit un número incorrecte!!");
            }catch(ArithmeticException e){
                System.out.println("Has escrit un número 0!!");
            }
        }while(true);

        System.out.println(num);
    }
}