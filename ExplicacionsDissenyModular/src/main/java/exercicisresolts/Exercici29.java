package exercicisresolts;

public class Exercici29 {

    public static int mcd(int a, int b){
        //Cas de parada
        if(a==b) return a;
        //Casos resursius
        if(a<b) return mcd(a, b-a);
        else return mcd(a-b, b);
    }
    public static int mcdNR(int a, int b){

        //Casos resursius
        while(a!=b){
            if(a<b)  b=b-a;
            else a=a-b;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(mcd(1407676575,356767665));
        System.out.println(mcdNR(140,35));
    }
}
