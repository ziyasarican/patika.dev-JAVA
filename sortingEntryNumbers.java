import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter "+(i+1)+". number:");
            numbers[i] = input.nextInt();
        }
        Arrays.sort(numbers);
        for (int i = 0; i < 3; i++)
            System.out.println(numbers[i]);
    }

}
