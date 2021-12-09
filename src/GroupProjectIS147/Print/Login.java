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
        }else {
            System.out.println("Invalid Password. Please Try Again.");
        }

    }
}
