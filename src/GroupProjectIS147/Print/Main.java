package GroupProjectIS147.Print;

import java.util.Scanner;

public class Main {
    
    //    static String [] pillArray = new String[10];  (maybe global variable for chart )

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;

        do {
            InitialMenu.instructions();

            try {
                option = input.nextInt();
                switch (option) {

                    case 1: {
                        Login login = new Login();
                        break;
                    }
                    case 2: {
                        System.out.println("Application Closed. Goodbye.");
                        break;
                    }
                    default: {

                        System.out.println("Invalid Input. Choose an option from instructions");
                        System.out.println();
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid Input. You must enter a number from the Instructions");
                input.nextLine();

            }

        }while (option != 2) ;
        
        /*ChartPillAmount inputPill = new  ChartPillAmount();     // user pill amount
        inputPill.getPillAmount();

        DisplayMonths monthsInput = new DisplayMonths();    // displays months for user
        monthsInput.monthsOptions();


        StartMonth startMonths = new StartMonth(); // asks user to enter start month
        startMonths.enterMonths();

        EndMonth endMonths = new EndMonth();
        endMonths.askEndMonth();
        endMonths.enterMonths();*/      // Inherits the swtich, but how to isolate swtich from start month class ?


    }
}
