import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number, sum = 0;
        Scanner input = new Scanner(System.in);
        do{
            number = input.nextInt();
            if(number % 4 == 0)
                sum+=number;
        }while(number % 2 != 1);
        System.out.println(sum);
    }
}
