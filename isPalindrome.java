import java.util.Scanner;

public class Main {

    static int isPalindrome(int number){
        int temp = number, reverseNumber = 0, lastDigit;
        while(temp != 0){
            lastDigit = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            temp /= 10;
        }
        return reverseNumber;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(isPalindrome(number));
    }
}
