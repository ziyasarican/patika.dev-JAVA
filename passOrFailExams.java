import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] lesson = new int[5];
        int sum = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the grade lesson"+(i+1)+":");
            lesson[i] = input.nextInt();
            boolean check = true;

            if(lesson[i] > 100 || lesson[i] < 0){
                while (check) {
                    System.out.print("Enter the valid grade lesson" +(i+1)+":");
                    lesson[i] = input.nextInt();
                    if(lesson[i]<=100 && lesson[i]>=0){
                        check = false;
                    }
                }
              }
            sum = sum + lesson[i];
        }
        float average = sum/5;
        if (average >= 55)
            System.out.println("You pass the exams!");
        else
            System.out.println("You failed!");
    }

}
