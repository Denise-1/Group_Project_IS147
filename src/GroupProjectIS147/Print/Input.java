package GroupProjectIS147.Print;

import java.util.Scanner;

public class Input {
    public static void userInput () {

        Scanner askUser = new Scanner(System.in);
        int user = 0;

        do {
            System.out.println();
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
                   StartDate printDate = new StartDate(3,1);      //no need to call this bc method is static
                   System.out.println("You started your medication on: " + "March " + printDate.getStart() + " 2021");
                   System.out.println("You ended your medication on: " + "December " + printDate.getEndPass() + " 2021");// this loops
                   break;
                case 3:     //medication description
                    pillNames printNames = new pillNames("Metformin", "Melatonin");
                    Description1 printDescription1 = new Description1();
                    Description2 printDescription2 = new Description2();

                    System.out.println("Your first pill name is: " + printNames.getMyPill1());
                    printDescription1.DESCRIPTIONPILL1();
                    System.out.println();
                    System.out.println("Your second pill name is: " + printNames.getMyPill2());
                    printDescription2.descriptionPill2();
                    break;
                case 4:     //refill number
                    Refill_Number refill = new Refill_Number();
                    System.out.println("You have a number of: " + refill.refillInt(2) + " refills for each" +
                            "of your pills");
                    break;
                case 5:     //how many pills should be taken
                    Pill_Intake intake = new Pill_Intake(2,1);
                    pillNames printNames2 = new pillNames("Metformin", "Melatonin");
                    System.out.println("You take " + intake.getIntake1() + " " +
                            printNames2.getMyPill1() + " a day");
                    System.out.println("You take " + intake.getIntake2() + " " +
                            printNames2.getMyPill2() + " every other day");
                    break;
                case 6:
                    pillNames printNames3 = new pillNames("Metformin", "Melatonin");
                    System.out.println("You took " + printNames3.getMyPill1() +
                            " today at " + java.time.LocalDate.now());
                    System.out.println("You did not take " + printNames3.getMyPill2() +
                            "today at " + java.time.LocalDate.now());
                    break;
                case 7:     //side effects
                    Side_Effects showSideEffects = new Side_Effects();
                    pillNames printNames4 = new pillNames("Metformin", "Melatonin");
                    System.out.println(printNames4.getMyPill1() + "'s" + " side effects include:");
                    showSideEffects.pillEffect1();

                    System.out.println("\n" + printNames4.getMyPill2()+ "'s" + " side effects include:");
                    showSideEffects.pillEffect2();
                    break;
                case 8:
                    DocInfo printDoctorInfo = new DocInfo();
                    printDoctorInfo.contactInfo();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            } // switch
        } while (0 != user);




    }


}
