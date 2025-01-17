package exercicisresolts;

import static com.iesebre.library20242025.Numero.numVector;
import static com.iesebre.library20242025.Numero.vectorDigits;

public class Exercici13 {

    public static void main(String[] args) {
        System.out.println(numVector(new int[]{0}));
        System.out.println(numVector(vectorDigits(123)));
        System.out.println(numVector(vectorDigits(-123)));
        System.out.println(numVector(null));
        System.out.println(numVector(new int[]{}));

    }
}
