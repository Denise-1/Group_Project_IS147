package GroupProjectIS147.Print;

import java.util.Scanner;

/**
 * Main method includes switch statement to use login menu as stated in instructions.
 * Takes user input to allow a user to either sign in or exit.
 * @see InitialMenu
 * @see Login
 *
 * @author Johan G
 */

public class Main {


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

    }
}
