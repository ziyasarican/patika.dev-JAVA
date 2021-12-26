import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int year;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your birth year:");
        year = input.nextInt();

        if(year % 12 == 0)
            System.out.println("Your Chinese zodiac sign is Monkey");
        else if(year % 12 == 1)
            System.out.println("Your Chinese zodiac sign is Rooster");
        else if(year % 12 == 2)
            System.out.println("Your Chinese zodiac sign is Dog");
        else if(year % 12 == 3)
            System.out.println("Your Chinese zodiac sign is Pig");
        else if(year % 12 == 4)
            System.out.println("Your Chinese zodiac sign is Mause");
        else if(year % 12 == 5)
            System.out.println("Your Chinese zodiac sign is Ox");
        else if(year % 12 == 6)
            System.out.println("Your Chinese zodiac sign is Tiger");
        else if(year % 12 == 7)
            System.out.println("Your Chinese zodiac sign is Rabbit");
        else if(year % 12 == 8)
            System.out.println("Your Chinese zodiac sign is Tiger");
        else if(year % 12 == 9)
            System.out.println("Your Chinese zodiac sign is Snake");
        else if(year % 12 == 10)
            System.out.println("Your Chinese zodiac sign is Horse");
        else if(year % 12 == 11)
            System.out.println("Your Chinese zodiac sign is Sheep");
    }
}
