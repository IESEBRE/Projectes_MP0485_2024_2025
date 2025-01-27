package exercicisresolts;

public class Exercici31 {

    public static double potenciaRec(double x, int n) {
        if (n == 0) {return 1;}
        else if (n > 0) {return x*potenciaRec(x,n-1);}
        else {return 1/potenciaRec(x,-n);}
    }

    public static void main(String[] args) {
        System.out.println(potenciaRec(2,300000));
    }


}
