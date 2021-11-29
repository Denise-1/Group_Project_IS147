package GroupProjectIS147.Print;

import java.util.Scanner;

public class InitialMenu {

        public static void initialMenu() {
        Scanner input = new Scanner(System.in);
        int option = 0;

        do {
            instructions();

            try {
                option = input.nextInt();
                switch (option) {

                    case 1: {
                        //create class for login
                        break;
                    }
                    case 2: {
                        //create class for registration
                        break;
                    }
                    case 3: {
                        System.out.println("\t\t\tApplication Closed");
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

        }while (option != 3) ;

        }
        public static void instructions(){
            System.out.println("\t\t\t==================================");
            System.out.println("\t\t\tPill Management System");
            System.out.println("\t\t\tEnter 1 to Sign In");
            System.out.println("\t\t\tEnter 2 to Register for Sign In");
            System.out.println("\t\t\tEnter 3 to Close Application");
            System.out.println("\t\t\t==================================");
        }

}
