package exercicisresolts;

public class Exercici33 {

    public static int nombreCombinatoriRec(int n, int m){
        if(n < m) return -1;
        //Casos  de parada
        if(n == m || m==0) return 1;

        //Cas recursiu
        return nombreCombinatoriRec(n - 1, m -1) + nombreCombinatoriRec(n-1, m);
    }

    public static void main(String[] args) {
        System.out.println(nombreCombinatoriRec(5, 3));
    }
}
