import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int heat = input.nextInt();

        if(heat<5)
            System.out.println("You should ski.");
        else if(heat>5 && heat<15)
            System.out.println("You should go to cinema.");
        else if(heat>15 && heat<25)
            System.out.println("You should go to picnic");
        else if(heat>25 && heat<35)
            System.out.println("You should go to swim");
        else
            System.out.println("You should not leave the home");

    }

}
