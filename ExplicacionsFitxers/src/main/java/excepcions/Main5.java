package excepcions;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {


        try{
            int[] array=new int[]{1,2,3};
            String string="123";
            int index=25;
            //System.out.println(string.charAt(index));
            System.out.println(array[index]);

        }       //Els catch sempre han d'anar tractant excepcions de més específiques a més generals
        catch(StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e){
            System.out.println("Hi ha hagut un error conegut!!");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Hi ha hagut un error desconegut!!");
        }catch(Exception e){
            System.out.println("Hi ha hagut una excepció que no sé d'on bé...");
        }

    }
}