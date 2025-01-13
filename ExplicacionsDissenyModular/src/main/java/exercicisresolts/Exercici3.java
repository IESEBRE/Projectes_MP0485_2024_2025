package exercicisresolts;

import java.util.Scanner;

import static com.iesebre.library20242025.Numero.demanaValor;

public class Exercici3 {

    public static void main(String[] args) {
        final int F=20;
        final int C=20;
        final int P=20;

        //Demanem quin alumne vol consultar
        int alumne = demanaValor("l'alumne", F);

        //Demanem quin mòdul vol consultar
        int mp = demanaValor("el mòdul", C);

        //Demanem quina nota vol consultar
        int nota = demanaValor("la nota", P);

    }

}
