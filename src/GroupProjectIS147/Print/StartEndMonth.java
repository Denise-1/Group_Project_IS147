package GroupProjectIS147.Print;

import java.util.Scanner;

public class StartEndMonth {

    public static void enterMonths() {

        Scanner monthsInput = new Scanner(System.in);       // inherit swtich statements to the end months?
        System.out.println("Enter the start month you took your medication(s): ");
        int start = monthsInput.nextInt();
        switch (start){         // use loop here somehow to loop number of medications user has?
            // add loop somewhere
            case 1:
                System.out.println("You started your medication(s) in January");
                break;
            case 2:
                System.out.println("You started your medication(s) in Feburary");
                break;
            case 3: System.out.println("You started your medication(s) in March");
                break;
            case 4:
                System.out.println("You started your medication(s) in April");
                break;
            case 5:
                System.out.println("You started your medication(s) in May");
                break;
            case 6:
                System.out.println("You started your medication(s) in June");
                break;
            case 7: System.out.println("You started your medication(s) in July");
                break;
            case 8:
                System.out.println("You started your medication(s) in August");
                break;
            case 9:
                System.out.println("You started your medication(s) in September");
                break;
            case 10:
                System.out.println("You started your medication(s) in October");
                break;
            case 11:
                System.out.println("You started your medication(s) in November");
                break;
            case 12:
                System.out.println("You started your medication(s) in December");
                break;
            default:
                System.out.println("This is not a valid month entry");
        }


//        System.out.println("Enter the end month of your medication(s): ");
//        int end = monthsInput.nextInt();



        // put if statement here for months

    }

}





    //    public StartEndMonth(int start, int end) {
//        // if statement here for months
//
//
//    }


//    public static int months() {
//        System.out.println("Enter the month you started your medication: ");
//          // put if statments here
//    }


//    Scanner date = new Scanner(System.in);
//    public static void print(){
//
//
//
//        Scanner startEndInput = new Scanner(System.in);
//
//        System.out.println("Enter the date you started your medication: ");
//
//        int start = startEndInput.nextInt();
//
//        System.out.println("Enter");


//}
