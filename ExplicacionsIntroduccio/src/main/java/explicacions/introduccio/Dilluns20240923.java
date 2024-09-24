package explicacions.introduccio;

public class Dilluns20240923 {

    public static void main(String[] args) {
        //Declaració de variables
        int a,b,c,d,e, f = 9;
        e = 23;
        a = b = c = d = e = f;
        a=3;
        b=2;
        c=5;
        d =  ((a + ((b * c) / 65)) + 42);

        int q = a / b;
        int r =a % b;

        System.out.println(a+" dividit entre "+b+" val "+q);
        System.out.println("i el resto val "+r);
        //a = b * q + r;

        //Vaig a forçar a que la divisió sigue real, fent el que s'anomena "casting"
        double qReal = (double) a / b;
        qReal =  a * 1.0 / b;
        qReal =  (a + 0.0) / b;
        System.out.println(a+" divisió real entre "+b+" val "+qReal);


    }

}

class Booleans1{

    public static void main(String[] args) {
        boolean esA, esB, esC;

        esA = true;
        esB = false;
        esC = esA = esB = false;

        boolean resultat = (esA || ((!esB) && esC));

        System.out.println(resultat);

    }
}

class Booleans2{

    public static void main(String[] args) {
        int a = 0;
        int b = 5;

        boolean resultat = (((a == 0) && (a > b)) || (a * 23 % 7 == 0));

        System.out.println(resultat);
    }


}

class TiposCoincidents{

    public static void main(String[] args) {
        String cadena = "Sóc una cadena";
        int numero = 56;

        cadena = "Text anterior " + cadena + " text posterior";

        System.out.println("La cadena \\\""+cadena+"\" té una longitud de "+cadena.length()+" caràcters.");

        cadena = "45";
        cadena = numero + "";

        double real = 6;        //conversió automàtica d'enter a real
        numero = (int) 23.56;   //obligat fer càsting per passar de real a enter
    }

}