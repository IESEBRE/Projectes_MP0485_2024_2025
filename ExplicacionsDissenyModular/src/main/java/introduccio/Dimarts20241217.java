package introduccio;

public class Dimarts20241217 {

    public static int metodeNoRecursiu(int n){
        int suma=0;

        for (int i = 1; i <=n ; i++) {
            suma+=i;
        }
        return suma;
    }

    public static int metodeRecursiu(int n){
        if(n==0) return 0;
        return n+metodeRecursiu(n-1);
    }

    public static void main(String[] args) {
        System.out.println(metodeNoRecursiu(5000000));
        System.out.println(metodeRecursiu(5000000));
    }

}
