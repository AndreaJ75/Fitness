package POO;


import java.util.ArrayList;
import java.util.Scanner;

import static POO.MenuPChoice.addGymSet;
import static POO.MenuPChoice.checkGymSet;

public class Main {

    public static void main(String[] args) {

        // ***********************  PRINCIPAL MENU
        // Afficher le Menu Principal
        // option 1 : saisi du set
        // option 2 : Affichage STAT
        // option 3 : QUIT

        ArrayList menuP = new ArrayList();
        menuP.add(0, "1. SAISI DU SET : ");
        menuP.add(1, "2. AFFICHAGE STAT : ");
        menuP.add(2, "3. QUIT ");

        // Possible MenuChoice :
        ArrayList menuV = new ArrayList();
        menuV.add("1");
        menuV.add("2");
        menuV.add("3");

        // ************************************
        // Depending on Menu Choice, process :
        // ************************************

        String choiceSelected = " ";
        //Scanner sc = new Scanner(System.in);

        MenuDisplayCreation.menuACreer(menuP, menuV);
//
//        do {
//            int i = 0;
//            while (i < menuP.size()) {
//                System.out.println(menuP.get(i));
//                i = i + 1;
//            }
//            // Choix de Menu
//            System.out.println(" ");
//            System.out.println(" Choix de Menu : ");
//            choiceSelected = sc.nextLine();
//        } while (!(choiceSelected.equals("1") || choiceSelected.equals("2") || choiceSelected.equals("3")));

        switch (choiceSelected) {
            case "1":
                // *********************************************************************************************
                //  record Gym exercices in csv file : Gym exercice object creation/ Gym Set object creation
                // *****************************************************************************************
                //  * Request for gymExerciceContent (+ update Exercice object using setGymExerciceContent method)
                //  * Request for repetitionNumber for considered Set
                //  * Request for exerciceLiftedWeight for considered Set
                //  * Concatenate and Record all above inside of .csv file
                // *********************************************************************************************
                addGymSet();
                break;
            case "2":
                // *********************************************************************************************
                //  Gym exercices Stat provided :
                // *******************************
                //  * read csv file : fill in a TREEMAP (use key object GymExercice to access TREEMAP)
                //  * provide GymExercice unique objet for menuListExercice
                //  * Request menuListChoice (to save)
                //  * Request for statModeChoice (to save)
                //  * Use selected menuListChoice(key1) + selected statModeChoice(key2)
                //    as Keys (object GymExercice // object gymSet to access TreeMap with Keys
                //    and gets STAT values requested
                // *********************************************************************************************
                checkGymSet();
                break;
            case "3":
                System.out.println("***** QUIT REQUESTED ******");
                break;
            default:
                System.out.println(" ");
                System.out.println("Invalid choice value, please choose between value \"1\", \"2\"& \"3\" : ");
                System.out.println(" ");
                break;
        }

    }
}
