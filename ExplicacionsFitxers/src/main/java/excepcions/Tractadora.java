package excepcions;
import static excepcions.Propagadora.generaExcepcio;

public class Tractadora {

    public static void main(String[] args) {
        try{
            generaExcepcio(8);
        } catch (NullPointerException e) {
            System.out.println("Ja m'ho esperava!!");;
        }
    }

}
