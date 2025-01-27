package exercicisresolts;

public class Exercici32 {

    public static int fibonacci(int n){
        //Casos de parada
        if(n<0) return -1;
        if(n==0 || n==1) return n;
        //Casos recursius, n>=2
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        int ant=1;
        for (int i = 2; i < 50; i++) {

            System.out.format("Terme %d-èssim: %d%n", i, fibonacci(i));
            System.out.println("Número d'or -->  " + (double)fibonacci(i)/fibonacci(i-1));
            System.out.println("/n");
        }
    }

}
