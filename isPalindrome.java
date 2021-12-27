import java.util.Scanner;

public class Main {

    static void isPalindrome(int number){
        int temp = number, reverseNumber = 0, lastDigit;
        while(temp != 0){
            lastDigit = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            temp /= 10;
        }
        if(reverseNumber == number)
            System.out.println(number + " is palindrome");
        else
            System.out.println(number + " is not palindrome");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        isPalindrome(number);
    }
}
