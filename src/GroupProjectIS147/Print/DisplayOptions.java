package GroupProjectIS147.Print;

public class DisplayOptions {

    public void userOptions (){
        System.out.println("\t\t\t==============================================================");
        System.out.println("\t\t\tPick an option that you would like to view for your medication(s): ");
        System.out.println();
        System.out.println("\t\t\tNumber of medications prescribed by doctor - ENTER 1" );
        System.out.println("\t\t\tMedication(s) start and end date - ENTER 2"); //class (error in class)

        System.out.println("\t\t\tMedication(s) name(s) and description(s) - ENTER 3");    //class
        System.out.println("\t\t\tNumber of refills - ENTER 4");        // class
        System.out.println("\t\t\tHow many pills should be taken - ENTER 5");
        System.out.println("\t\t\tCheck to see if you took you medication today - ENTER 6");
        System.out.println("\t\t\tSide effects - Enter 7");
        System.out.println("\t\t\tDoctor information - ENTER 8");   //name of doc, contact, etc
        System.out.println("\t\t\tExit - ENTER 0");
        System.out.println();
        System.out.println("\t\t\t==============================================================");
        // put these in their own class and call them in a swtich
    }
}
