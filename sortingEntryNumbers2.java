import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void scan(int[] arr,Scanner input){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter " + (i + 1) + ". element : ");
            arr[i] = input.nextInt();
        }
    }

    static void sorting(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = input.nextInt();
        int[] numbers = new int[n];

        scan(numbers,input);
        sorting(numbers);

    }
}
