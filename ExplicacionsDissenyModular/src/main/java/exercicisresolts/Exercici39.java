package exercicisresolts;

import java.util.Arrays;

import static com.iesebre.library20242025.Data.diaSeguent;

public class Exercici39 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(diaSeguent(29,2,2000)));

        for (int i = 0; i < diaSeguent(29,2,2000).length; i++) {
            System.out.println(diaSeguent(29,2,2000)[i]);
        }
    }
}
