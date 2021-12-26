import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = 1; i <= number ; i++) {
            if(i % 12 == 0)
                System.out.println(i);
        }
    }
}
