import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        float sum = 0f;

        for (int i = 1; i <= number; i++) {
            sum+=(float)1/i;
        }
        System.out.println(sum);
    }
}
