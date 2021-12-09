package GroupProjectIS147.Print;

import java.util.Scanner;

public class Input {
    public static void userInput () {

        Scanner askUser = new Scanner(System.in);
        int user = 0;

        do {
            System.out.println("What would you like to view: ");
            user = askUser.nextInt();

            switch (user) {     // want to loop this
                case 0:
                    System.out.println("You have exited out of the options");
                    break;
                case 1:     //pill amount
                    PillAmount getAmount = new PillAmount();    // calls class
                    System.out.println("You are talking: " + getAmount.getShowAmount(2) + " pills");
                    break;
                case 2:
                    StartDate printDate = new StartDate();      //
                    int var = printDate.StartDateInt(3,1);
                    System.out.println("You started you medication on: " + var);    // this loops
                    break;


                default:
                    System.out.println("Invalid option. Try again.");
                    break;

            } // switch
        } while (0 != user);

//        PillName1 pill1 = new PillName1();
//        pill1.name1();


    }


}
