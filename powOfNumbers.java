import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int result = 1;
        for (int i = 1; i <= number2; i++) {
            result*=number1;
        }
        System.out.println(result);
    }
}
