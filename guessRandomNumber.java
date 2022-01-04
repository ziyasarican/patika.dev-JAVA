import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // write your code here
        Random random = new Random();
        int number = random.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;

        while(right < 6){
            selected = input.nextInt();

            if(selected == number){
                System.out.printf("Congratulations!");
                break;
            }
            else if (selected < number)
                System.out.println("Your input is smaller than random value");
            else
                System.out.println("Your input is bigger than random value");
            right++;
        }
    }
}
