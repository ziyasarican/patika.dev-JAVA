import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int distance, age, tripType;

        while(true){
            System.out.print("Enter distance:");
            distance = input.nextInt();
            System.out.print("Enter your age:");
            age = input.nextInt();
            System.out.print("Enter the trip type:");
            tripType = input.nextInt();

            if(distance < 0 || age < 0){
                System.out.println("Please enter the valid value!");
            }
            else{
                System.out.print("Total: ");
                System.out.println(calculateTotal(distance, age, tripType));
            }

        }
    }
    public static float calculateTotal(int distance, int  age, int tripType){
        float total = 0;
        if(age<12 && tripType ==1){
            total = (float) (distance*0.10*0.5);
        } else if (age < 12 && tripType == 2) {
            total = (float) (distance * 0.10 * 2 * 0.8 * 0.5);
        } else if (age > 12 && age < 24 && tripType == 1) {
            total = (float) (distance * 0.10 * 0.9);
        } else if (age > 12 && age < 24 && tripType == 2) {
            total = (float) (distance * 0.10 * 2 * 0.8 * 0.9);
        } else if (age > 65 && tripType == 1) {
            total = (float) (distance * 0.10 * 0.7);
        } else if (age > 65 && tripType == 2) {
            total = (float) (distance * 0.10 * 2 * 0.8 * 0.7);
        }
        else if (tripType == 1)
            total = (float)(distance*0.10);
        else
            total = (float)(distance*0.10*0.8);
        return (float) total;
    }
}
