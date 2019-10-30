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


        // Record & csv file Header save :
        System.out.println("Gym Set Exercice" + ";" + "Set Repetition Number" + ";" + "Set Weight lifted");
        // Write file .csv    // to be completed

        // Choix de Menu Gym Set :
        System.out.println(" Quel option choisissez-vous ? ");
        MenuDisplayCreation.menuACreer(menuG, menuV);

        // Request for gymExercice to create :
        System.out.println("Gym Set Exercice : ");
        String g = scGym.nextLine();

        // Request for gymRepeatNumber to create :
        System.out.println("Gym Set Repetition Number : ");
        String r = scGym.nextLine();

        // Request for gymWeightLifted to create :
        System.out.println("Gym Set Weight lifted : ");
        String w = scGym.nextLine();


        System.out.println(g + ";" + r + ";" + w);


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
