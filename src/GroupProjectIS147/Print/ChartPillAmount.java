package GroupProjectIS147.Print;

import java.util.Scanner;

public class ChartPillAmount {

    public static String[] getPillAmount() {
        Scanner userAmount = new Scanner(System.in);

        System.out.println("Enter the number of pill(s) you need to take: ");
        int inputAmount = userAmount.nextInt();

        String[] pillTypeArray = new String[inputAmount];

        for (int type = 0; type < inputAmount; type++) {
            System.out.println("Enter the name of your medication " + (type + 1));
            pillTypeArray[type] = userAmount.next();
        }

        System.out.println("Medication Name(s): ");
        for (int medPrint = 0; medPrint < inputAmount; medPrint++) {
            System.out.println(pillTypeArray[medPrint]);
        }
        return getPillAmount();
    }
}   //ChartPillAmount Class End
