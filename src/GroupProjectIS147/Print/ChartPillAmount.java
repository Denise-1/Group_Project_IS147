package GroupProjectIS147.Print;

import java.util.Scanner;

public class ChartPillAmount {

    public static String getPillAmount() {
        Scanner userPill = new Scanner(System.in);
        System.out.println("Enter the number of pills you need to take: ");
        String inputAmount = userPill.nextLine();

        return inputAmount;
    }
} //ChartPillAmount Class End
