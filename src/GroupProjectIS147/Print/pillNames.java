package GroupProjectIS147.Print;

/**
 * Displays the name of the medication the user takes
 * @see Input case 5 in switch statement
 *
 * @author Denise C
 */

public class pillNames {
    String myPill1;
    String myPill2;


    public pillNames(){

    }

    /**
     * References the name of two pills the user will take
     * @param myPill1
     * @param myPill2
     */

    public pillNames(String myPill1, String myPill2){
        this.myPill1 = myPill1;
        this.myPill2 = myPill2;
    }

    public String getMyPill1() {
        return myPill1;
    }
    public void setMyPill1(String myPill1) {
        this.myPill1 = myPill1;
    }


    public String getMyPill2() {
        return myPill2;
    }
    public void setMyPill2(String myPill2) {
        this.myPill2 = myPill2;
    }

}
