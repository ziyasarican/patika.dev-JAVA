import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // write your code here
        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};
        boolean[] isVisited = new boolean[numbers.length];
        Arrays.fill(isVisited,false);

        for (int i = 0; i < numbers.length; i++) {


            if(isVisited[i] == false){
                int count = 1;
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        isVisited[j] = true;
                        count++;
                    }
                }
                System.out.println(count + " times " + numbers[i]);
            }

        }
    }
}
