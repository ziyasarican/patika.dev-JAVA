import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String userName = "Java", password = "LearnJava",userNameInput,passwordInput;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username:");
        userNameInput = input.nextLine();
        System.out.print("Enter your password:");
        passwordInput = input.nextLine();

        String query;
        if(userNameInput.equals(userName) && passwordInput.equals(password)){
            System.out.println("Successful Login!");
        }
        else{
            System.out.print("Wrong ID information! \n Do you want to reset your password?(y/n)");
            query = input.nextLine();
            if(query.equals("y")){
                String newPasswordInput;
                System.out.print("Enter new password:");
                newPasswordInput = input.nextLine();
                if(newPasswordInput.equals(password) && newPasswordInput.equals(passwordInput))
                    System.out.println("Login Failed!");
                else
                    System.out.println("Created new password");
            }
            else
                System.out.println("Login Failed!");
        }
    }
}
