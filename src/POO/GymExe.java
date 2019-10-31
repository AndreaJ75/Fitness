package POO;

public class GymExe {

    private String gymExeContent ;
    private Integer gymExeOccurences;

    public GymExe(String gymExeContent, Integer gymExeOccurences) {
    gymExeContent = this.gymExeContent;
    gymExeOccurences = this.gymExeOccurences;

    }

    public String getGymExeContent() {
        return gymExeContent;
    }

    public Integer getGymExeOccurences() {
        return gymExeOccurences;
    }

    public void setGymExeContent(String gymExeContent) {
        this.gymExeContent = gymExeContent;
    }

    public void setGymExeOccurences(Integer gymExeOccurences){
        this.gymExeOccurences = gymExeOccurences;
    }

    // Calcul du nombre d'occurence d'exercices :


}
