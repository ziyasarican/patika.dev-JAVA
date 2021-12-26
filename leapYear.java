import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int year;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the year:");
        year = input.nextInt();

        if(year % 100 == 0){
            if(year % 400 == 0)
                System.out.println(year+ " is leap year.");
            else
                System.out.println(year+" is not leap year.");
        }
        else if (year % 4 == 0)
            System.out.println(year+" is leap year.");
        else
            System.out.println(year + " is not leap year.");
    }
}
