package GroupProjectIS147.Print;

import java.util.Scanner;

public class InitialMenu {

        /*public static void initialMenu() {
        Scanner input = new Scanner(System.in);
        int option = 0;

        do {
            instructions();

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

        }while (option != 2)

        } */
        public static void instructions(){
            System.out.println("==================================");
            System.out.println("Pill Management System");
            System.out.println("Enter 1 to Sign In");
            System.out.println("Enter 2 to Close Application");
            System.out.println("==================================");
        }

}
