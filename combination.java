import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        int result = (combination(number1)/(combination(number2)*combination(number1-number2)));
        System.out.println(result);

    }
    public  static int combination(int number){
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact*=i;
        }
        return fact;
    }
}
