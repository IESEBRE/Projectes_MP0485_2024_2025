package exercicisresolts;

import static com.iesebre.library20242025.Data.dataCorrecta;
import static com.iesebre.library20242025.Data.esBixest;

public class Exercici38 {

    public static void main(String[] args) {
        if(esBixest(2025)) System.out.println("Any bixest");
        else System.out.println("Any normal");

        System.out.println(dataCorrecta(2,82,1900)?"Data correcta!!":"Data incorrecta!!");
    }




}
