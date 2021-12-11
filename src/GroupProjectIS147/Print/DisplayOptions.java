package GroupProjectIS147.Print;

/**
 * Displays the main menu that the user can follow once logged in.
 * User can follow menu by inputting values.
 * @see Input
 *
 * @author Denise C
 */

public class DisplayOptions {

    public void userOptions (){
        System.out.println("==============================================================");
        System.out.println("Pick an option that you would like to view for your medication(s): ");
        System.out.println();
        System.out.println("Number of medications prescribed by doctor - ENTER 1" );
        System.out.println("Medication(s) start and end date - ENTER 2");
        System.out.println("Medication(s) name(s) and description(s) - ENTER 3");
        System.out.println("Number of refills - ENTER 4");
        System.out.println("How many pills should be taken - ENTER 5");
        System.out.println("Check to see if you took you medication today - ENTER 6");
        System.out.println("Side effects of medication(s) - Enter 7");
        System.out.println("Doctor information - ENTER 8");
        System.out.println("Exit - ENTER 0");
        System.out.println();
        System.out.println("==============================================================");
    }
}
