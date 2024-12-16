package exercicisresolts;

public class Exercici17 {

    public static int[] tractaParametres(int... params){
        //Tractament de casos "especials"
        if(params==null) return null;
        if(params.length==0) return null;

        //Tractament de vectors en caselles
        int suma, max, min;

        max=min=suma=params[0];     //tractem la primera casella
        //Recorrem el vector a partir de la segona casella
        for (int i = 1; i < params.length; i++) {
            //Actualitzem el màxim si cal
            if(params[i]>max) max=params[i];
            //Actualitzem el mínim si cal
            if(params[i]<min) min=params[i];
            //Sumen el valor de la casella actual
            suma+=params[i];
        }

        return new int[]{suma,params.length,max,min};
    }

    public static void main(String[] args) {

        tractaParametres();

        tractaParametres(null);

        tractaParametres(new int[]{});
    }

}
