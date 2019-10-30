package POO;

public class GymExe {

    private String gymExeContent ;

    public GymExe(String gymExeContent) {
    gymExeContent = this.gymExeContent ;
    }

    public String getGymExeContent() {
        return gymExeContent;
    }

    public void setGymExeContent(String gymExeContent) {
        this.gymExeContent = gymExeContent;
    }

    public void gymExeMenuBuilder() {
        GymExeCreationClass.gymExeCreation();

    }
}
