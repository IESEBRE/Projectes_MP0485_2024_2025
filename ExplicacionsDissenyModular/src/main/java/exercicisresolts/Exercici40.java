package exercicisresolts;

import static com.iesebre.library20242025.Data.comparaDates;

public class Exercici40 {

    public static void main(String[] args) {

        System.out.println(comparaDates(1,1,2025,1,2,2025));
        System.out.println(comparaDates(1,1,2026,1,2,2025));
        System.out.println(comparaDates(1,1,2025,1,1,2025));
        System.out.println(comparaDates(1,1,2025,29,2,2025));

        System.out.println(comparaDates(new int[]{1,1,2025},new int[]{1,2,2025}));
        System.out.println(comparaDates(new int[]{1,1,2026},new int[]{1,2,2025}));
        System.out.println(comparaDates(new int[]{1,1,2025},new int[]{1,1,2025}));
        System.out.println(comparaDates(new int[]{1,1,2025},new int[]{29,2,2025}));
        System.out.println(comparaDates(null, new int[]{1,1,2025}));
        System.out.println(comparaDates(new int[]{1,1,2025},null));
        System.out.println(comparaDates(new int[]{1,2025}, new int[]{1,1,2025}));
        System.out.println(comparaDates(new int[]{1,1,2025},new int[]{1,1,2025,45}));

    }
}
