package GroupProjectIS147.Print;

import java.util.Scanner;

public class Input {
    public static void userInput () {

        Scanner askUser = new Scanner(System.in);
        System.out.println("What would you like to view: ");
        int userInput = askUser.nextInt();

        switch (userInput){
            case 1:
                PillAmount getAmount = new PillAmount(2);
                System.out.println("You are talking: " + getAmount.getShowAmount(2) + " pills");
                break;
            case 2:
                //description



        }   //switch END

    }

    //display options (make into amethod instead of displaymoths)

}
