import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Number: ");
        int number = input.nextInt();

        if(primeNumber(number,2) == 1)
            System.out.println(number + " is palindrome.");
        else
            System.out.println(number + " is not palindrome.");

    }

    static int primeNumber(int number, int i){

        if(i < number)
        {
            if(number % i != 0)
                return(primeNumber(number, ++i));
            else
                return 0;
        }
        else if (number == 2)
            return 1;
        else if (number < 2)
            return 0;
        return 1;

    }
}
