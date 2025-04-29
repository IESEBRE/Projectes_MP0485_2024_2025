package org.example.excepcions;

import java.io.EOFException;
import java.io.IOException;
import java.net.SocketException;
import java.util.Random;

public class Prova {

    public static void main(String[] args) {
        int[] nums = new int[5];

        for (int i = 0; i <= nums.length; i++) {
            try {
                System.out.println(nums[i]);
                if (i % 2 == 0) throw new IllegalArgumentException();
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Posició incorrecta");
            } catch (IllegalArgumentException exc) {

            }
        }
    }

}

class ProvaChecked {

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            try {
                llansoExcepcio();
            } catch (SocketException e) {
                System.out.println("Error de socket");
            } catch (EOFException e) {
                System.out.println("Error de fitxer");
            } catch(IOException e){
                System.out.println("Error d'entrada/sortida");
            }
        }
    }

    public static void llansoExcepcio() throws SocketException, EOFException, IOException {
        int aleatori = new Random().nextInt() % 4;
        if (aleatori == 0) throw new SocketException();
        else if (aleatori == 1) throw new EOFException();
        else if (aleatori == 2) throw new IOException();
        else System.out.println("No hi ha hagut excepció");
    }

}


class ExcepcioTractada extends Exception{

}

class ExcepcioNoTractada extends RuntimeException{

}