package introduccio;

public class Dilluns20241216 {

    public static void parametresVariables( boolean... params){
        //Primer que res mirem si params és null
        if(params==null) return;
        for (int i = 0; i < params.length; i++) {
            if(params[i]) System.out.println("El paràmetre és cert");
            else System.out.println("fals");
        }


    }

    //Mètode que retorna la quantitat de paràmetrfes rebuda i si rep un null retorna -1
    public static int parasmVarsRetornaEnter(double... args){
        if(args==null) return -1;

        return args.length;
    }

    public static void main(String[] args) {
//        boolean[] objecte=null;
//
//
//        parametresVariables();
//        parametresVariables(true);
//        parametresVariables(true,false,false,true);
//
//        parametresVariables(new boolean[]{true, false, false, true});
//        objecte=metodeQUeVedUnaAltraClasse();
//        parametresVariables(objecte);

        System.out.println(parasmVarsRetornaEnter());
        System.out.println(parasmVarsRetornaEnter(20));
        System.out.println(parasmVarsRetornaEnter(29.5, 3.4));
        System.out.println(parasmVarsRetornaEnter(null));


    }

    private static boolean[] metodeQUeVedUnaAltraClasse() {
        return null;
    }


}


class Segona{

    public static boolean barreja(int param1, double... params){
        System.out.println("Estic al primer");
        return true;
    }

    public static boolean barreja(double... params){
        System.out.println("Estic al segon");
        return false;
    }

    public static boolean barreja(int... params){
        System.out.println("Estic al tercer");
        return true;
    }

    //public static void malaBarreja(int... params, int p){}

    //public static void malaBarreja(int... params1, float... params2){}

    public static void main(String[] args) {

        double variable=1;


        barreja(1);     //primer, tercer
        barreja(1.5);     //segon
        barreja(1, 2.5, 3.7, 4.4);  //primer
        barreja(23,null);           //primer
        barreja(4.5,2.4,6.2); //segon
    }






}