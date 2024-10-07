package explicacions.introduccio;

import java.util.Scanner;

public class Dimarts20241001 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int valor;

        System.out.println("Introduix un número enter:");
        valor=ent.nextInt();

        //Estructura del switch
        switch(valor){
            case 0:
                System.out.println("Has posat un 0, t'incremento la variable");
                valor++;
                break;
            case 1:
                System.out.println("Has posat un 1, multiplico la variable per 10");
                valor=valor*10;
                break;
            case 2:
                valor--;
                break;
            case 3:
                valor--;
                break;
            default:
                System.out.println("No has entrat a cap dels casos tractats!!");
        }
    }
}

class Switch2{

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int valor;

        System.out.println("Introduix un número enter:");
        valor=ent.nextInt();


        switch(valor){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("has posat un numero menor que 5");
                break;
            case 5:
                System.out.println("has posat un 5");
                break;

        }


    }


}