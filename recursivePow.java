import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Number: ");
        int number = input.nextInt();
        System.out.printf("Exponent: ");
        int exponent = input.nextInt();

        if (number == 0 && exponent == 0)
            System.out.println("Invalid values!");
        else 
            System.out.println(pow(number,exponent));
    }

    static int pow(int number, int exponent){
        int result;
        if(number == 0)
            return 0;
        else if (exponent == 0)
            return 1;
        else
            return result = number * pow(number, exponent - 1);

    }
}
