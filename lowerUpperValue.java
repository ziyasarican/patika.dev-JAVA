import java.util.Arrays;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
        // write your code here
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();

            int[] numbers = {15,12,788,1,-1,-778,2,0};
            Arrays.sort(numbers);

            System.out.println(Arrays.toString(numbers));

            int i;
            for (i=0; i < numbers.length; i++) {
                if(numbers[i] > num)
                    break;
            }
            System.out.println("Lower value : " + numbers[i-1]);
            System.out.println("Greater value : "+ numbers[i]);
        }
    }
