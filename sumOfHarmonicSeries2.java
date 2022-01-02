import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbers = {1, 2};
        float sum = 0f;

        for(int i: numbers){
            sum += (float)1/i;
        }
        System.out.println(sum);

    }
}
