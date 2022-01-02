import java.util.Random;

public class Main {

    public static void main(String[] args) {
       // write your code here
        Boxer boxer1 = new Boxer("Jin Kazama", 7, 114, 85,50,100);
        Boxer boxer2 = new Boxer("Marshall Law", 9, 92, 90,50,0);

        Match match = new Match(boxer1, boxer2, 80, 90);
        match.fight();

    }
}
