import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr,int value){
        for(int i: arr){
            if(i==value)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // write your code here
        int[] numbers = {1,2,1,23,12,5,12,4,2,2,5,12,3,54};
        int[] newNumbers = new int[numbers.length];
        int start = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j]&& numbers[i] % 2 == 0) {
                    if(!isFind(newNumbers,numbers[i])){
                        newNumbers[start] = numbers[i];
                        start++;
                    }
                    break;
                }
            }
        }
        for (int value : newNumbers) {
            if (value != 0)
                System.out.print(value+" ");
        }
    }
}
