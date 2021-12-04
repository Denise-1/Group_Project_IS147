package GroupProjectIS147.Print;

public class Main {
    
    //    static String [] pillArray = new String[10];  (maybe global variable for chart )

    public static void main(String[] args) {
        InitialMenu.initialMenu();
        
        ChartPillAmount input = new  ChartPillAmount();     // user pill amount
        input.getPillAmount();

        DisplayMonths monthsInput = new DisplayMonths();    // displays months for user
        monthsInput.monthsOptions();


    }
}
