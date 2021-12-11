package GroupProjectIS147.Print;

/**
 * Use getters to display how many pills per prescribed medication the user must take.
 * @see Input case 5 in switch statement
 *
 * @author Denise C
 */

public class Pill_Intake {

    int intake1;
    int intake2;

    public  Pill_Intake(){
    }

    /**
     * Method called to display how much pills to take per prescribed medication
     * @param medIntake1 how many pills to take for the first medication
     * @param medIntake2 how many pills to take for the second medication
     */
    public Pill_Intake (int medIntake1, int medIntake2){
        this.intake1 = medIntake1;
        this.intake2 = medIntake2;
    }

    public int getIntake1() {
        return intake1;
    }

    public void setIntake1(int intake1) {
        this.intake1 = intake1;
    }

    public int getIntake2() {
        return intake2;
    }

    public void setIntake2(int intake2) {
        this.intake2 = intake2;
    }
}
