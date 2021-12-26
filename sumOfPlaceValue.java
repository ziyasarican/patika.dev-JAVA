import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        String temp = String.valueOf(number);

        int sum = 0;
        char[] dividedNumber = temp.toCharArray();
        for (int i = 0; i < temp.length(); i++) {
            sum+=Integer.parseInt(String.valueOf(dividedNumber[i]));
        }
        System.out.println(sum);
    }
}
