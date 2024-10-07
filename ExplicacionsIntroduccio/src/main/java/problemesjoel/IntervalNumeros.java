package problemesjoel;

import java.util.Scanner;

public class IntervalNumeros {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int a,b;

        a= ent.nextInt();
        b= ent.nextInt();


        if(a<b) System.out.println("El segon numero no es mes petit que el primer");
        else{   //a>=b

            while(a>=b){
                System.out.println(a);
                --a;
                //a-- i --a  --> a=a-1;
            }


        }

    }


}
