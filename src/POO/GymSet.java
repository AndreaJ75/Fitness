package POO;

public class GymSet {
    private GymExe gymExercice;
    private Integer setRepeatNumber;
    private Integer setWeightLifted;

    public GymSet(GymExe gymExercice, Integer setRepeatNumber, Integer setWeightLifted) {
        this.gymExercice = gymExercice;
        this.setRepeatNumber = setRepeatNumber;
        this.setWeightLifted = setWeightLifted;
    }

    public GymExe getGymExercice() {
        return gymExercice;
    }

    public Integer getSetRepeatNumber() {
        return setRepeatNumber;
    }

    public Integer getSetWeightLifted() {
        return setWeightLifted;
    }

    public void setGymExercice(GymExe gymExercice) {
        this.gymExercice = gymExercice;
    }

    public void setSetRepeatNumber(Integer setRepeatNumber) {
        this.setRepeatNumber = setRepeatNumber;
    }

    public void setSetWeightLifted(Integer setWeightLifted) {
        this.setWeightLifted = setWeightLifted;
    }

    //

}
