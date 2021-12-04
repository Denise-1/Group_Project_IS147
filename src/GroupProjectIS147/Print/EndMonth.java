package GroupProjectIS147.Print;

import java.util.Scanner;

public class EndMonth extends StartMonth {

    public void askEndMonth(){
        Scanner endInput = new Scanner(System.in);
        System.out.println("Enter the end month you will end your medication(s): ");
        int start = endInput.nextInt();
    }
}
