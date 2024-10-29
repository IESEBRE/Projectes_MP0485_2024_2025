package problemesjoel;

import java.util.Scanner;

public class NumerosBinarisArray {

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
            int[]  vector=new int[numero];
            if(numero==0) System.out.println("0");
            else{
                int index=0;
                while(numero!=0){
                    vector[index]= numero%2;
                    numero=numero/2;
                    index++;
                }
                //Mostrarem les caselles del vector de dreta a esquerra
                for (int j = index-1; j >= 0 ; j--) {
                    System.out.print(vector[j]);
                }
                System.out.println();
            }

        }
    }
}
