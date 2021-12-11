package GroupProjectIS147.Print;

public class PillAmount {
    private int showAmount;

    /***
     * Displays information related to how many types of pills/medication the user must take.
     * @see Input case 1 in switch statement
     *
     * @author Denise C
     */

    public PillAmount (){
    }

    public PillAmount(int showAmountHere) {
        this.showAmount = showAmountHere;
    }

    /***
     * Method stores how many types of pills/medication that user will take based on int value given
     * @param showAmount how many types of pills/medication the user takes
     */
    public int getShowAmount(int showAmount) {
        return showAmount;
    }

    public void setShowAmount(int showAmount) {
        this.showAmount = showAmount;
    }




}
