package GroupProjectIS147.Print;

import java.util.Scanner;

public class Login {
    public Login() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username");
        String userName = sc.nextLine();

        System.out.println("Enter Password");
        String password = sc.nextLine();

        if("user147".equals(userName) && "Fall2021".equals(password)){
            System.out.println("Login Successful");
            DisplayOptions options = new DisplayOptions();      // display options for user
            options.userOptions();

            Input askUser = new Input();
            askUser.userInput();
        }else {
            System.out.println("Invalid Password. Please Try Again.");
        }

    }
}
