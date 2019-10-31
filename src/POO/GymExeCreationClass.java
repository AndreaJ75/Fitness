package POO;


public class GymExeCreationClass {


    public static GymExe gymExeCreation(String gymExeChoice, Integer gymExeOccurences ){


        GymExe myGymExe = new GymExe(gymExeChoice,gymExeOccurences);

        switch (gymExeChoice) {
            case "1":
                myGymExe.setGymExeContent("SQUAT");
                break;

            case "2":
                myGymExe.setGymExeContent("LEG EXTENSION");
                break;

            case "3":
                myGymExe.setGymExeContent("LEG CURL");
                break;
            case "4":
                myGymExe.setGymExeContent("LEG PRESS");
                break;

            case "5":
                myGymExe.setGymExeContent("CRUNCH");
                break;

            case "6":
                myGymExe.setGymExeContent("BLANK");
                break;

            case "7":
                myGymExe.setGymExeContent("BENCH PRESS");
                break;

            case "8":
                myGymExe.setGymExeContent("TRICEPS EXTENSION");
                break;

            case "9":
                myGymExe.setGymExeContent("BICEPS CURL");
                break;
            default:
                System.out.println(" Saisie " + gymExeChoice + " invalide.");
                break;
        } return myGymExe;
    }

    public static GymSet gymSetCreation(GymExe gymExeChoice, Integer gymSetOccurence, Integer gymSetWeight ){


        GymSet myGymSet = new GymSet(gymExeChoice,gymSetOccurence, gymSetWeight);

        myGymSet.setGymExercice(gymExeChoice);
        myGymSet.setSetRepeatNumber(gymSetOccurence);
        myGymSet.setSetWeightLifted(gymSetWeight);

        return myGymSet ;

    }


}
