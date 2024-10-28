package problemesjoel;

import java.util.Scanner;

public class NumerosBinaris {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int casos = entrada.nextInt();
        entrada.nextLine();
        for (int i = 0; i < casos; i++) {
            //Tractament d'un cas
            int numero;
            String operacio [] = entrada.nextLine().trim().split(" "); //[*\r\n**]
            if (operacio[1].equals("+")){
                numero = Integer.parseInt(operacio[0])+Integer.parseInt(operacio[2]);
            } else {
                numero = Integer.parseInt(operacio[0])-Integer.parseInt(operacio[2]);
            }

            //Anem a convertir el numero de decimal a binari
            String resultat="";
            while(numero!=0){
                resultat= (numero%2) + resultat;
                numero=numero/2;
            }
            System.out.println(resultat);
        }
    }
}
