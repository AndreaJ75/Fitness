package POO;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuPChoice {

    public static void addGymSet() {
        // Data declaration :
        Scanner scGym = new Scanner(System.in);

        // Header menuGymExerciceSet :
        System.out.println(" ");
        System.out.println(" ****** SET YOUR GYM EXERCICE ******** ");
        System.out.println(" ");
        // menuGymExerciceSet declaration :
        ArrayList menuV = new ArrayList();
        ArrayList menuG = new ArrayList();

        menuG.add("1. Add a New Gym Set Stat ");
        menuG.add("2. Quit ");

        menuV.add("1");
        menuV.add("2");

        // Menu avec list d'exercices possibles:
        ArrayList menuE = new ArrayList();
        ArrayList menuV2 = new ArrayList();

        menuE.add("1. SQUAT ");
        menuE.add("2. LEG EXTENSION ");
        menuE.add("3. LEG CURL ");
        menuE.add("4. LEG PRESS ");
        menuE.add("5. CRUNCH ");
        menuE.add("6. PLANK ");
        menuE.add("7. BENCH PRESS ");
        menuE.add("8. TRICEPS EXTENSION ");
        menuE.add("9. BICEPS CURL ");

        menuV2.add("1");
        menuV2.add("2");
        menuV2.add("3");
        menuV2.add("4");
        menuV2.add("5");
        menuV2.add("6");
        menuV2.add("7");
        menuV2.add("8");
        menuV2.add("9");


        // Record & csv file Header save :
        // System.out.println("Gym Set Exercice" + ";" + "Set Repetition Number" + ";" + "Set Weight lifted");
        // Write file .csv    // to be completed

        // Choix de Menu Gym Set :
        String choiceSelected;
        do {
             choiceSelected = MenuDisplayCreation.menuACreer(menuG, menuV);

            // Request for gymExercice to create :
            if (choiceSelected.equals("1")) {

                // List possible exercice proposal + Request Gym Set exercice choice :
                String choiceSelected2 = MenuDisplayCreation.menuACreer(menuE, menuV2);

//                // Request for Gym set realized :
//                System.out.println(" ");
//                System.out.println("Gym Set Exercice realized : ");
//                String g = scGym.nextLine();

                // Request for gymRepeatNumber to create :
                System.out.println("Gym Set Repetition Number : ");
                String r = scGym.nextLine();

                // Request for gymWeightLifted to create :
                System.out.println("Gym Set Weight lifted : ");
                String w = scGym.nextLine();

                // Depending on selected choice => create the related exercice object:
                GymExe myGymExe = new GymExe(" ",0);
                int occurNumber = 0;
                occurNumber = occurNumber + 1;
                myGymExe = GymExeCreationClass.gymExeCreation(choiceSelected2,occurNumber);

                // Create also related Gym Set
                GymSet myGymSet = new GymSet(myGymExe, 0, 0);
                myGymSet = GymExeCreationClass.gymSetCreation(myGymExe, Integer.parseInt(r), Integer.parseInt(w));

                System.out.println("VIA GYM OBJECT : " + myGymExe.getGymExeContent() + ";" + r + ";" + w);
                System.out.println("VIA SET OBJECT : " + myGymSet.getGymExercice().getGymExeContent() + ";" + r + ";" + w);

            }

        } while (!(choiceSelected.equals("2")));



        // Ecriture des données fournies dans le fichiers csv
        //FileOutputStream

        //sc.nextLine();
    }

    public static void checkGymSet() {

        // Saisi de l'exercice de Gym a stater

        System.out.println("Sélectionner l\'exercice de Gym à stater : ");


        // Ecriture des données fournies dans le fichiers csv
        //FileOutputStream

        //sc.nextLine();
    }

}
