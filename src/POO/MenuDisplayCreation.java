package POO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MenuDisplayCreation {

    public static String menuACreer(ArrayList menuP, ArrayList menuV) {

        List test = Arrays.asList("1","2","3");

        String choiceSelected = " ";
        Scanner sc = new Scanner(System.in);
        do {
            int i = 0;
            while (i < menuP.size()) {
                System.out.println(menuP.get(i));
                i = i + 1;
            }
            // Choix de Menu
            System.out.println(" ");
            System.out.println(" Choix de Menu : ");
            choiceSelected = sc.nextLine();
        } while (!(menuV.equals(test)));
    return choiceSelected;

    }
}
