import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = 1; i < number; i=i*4) {
            System.out.println(i);
        }
        for (int i = 1; i < number; i=i*5 ) {
            System.out.println(i);
        }
    }
}
