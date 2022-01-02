import java.util.Random;

public class Match {
    Boxer boxer1;
    Boxer boxer2;
    int minWeight;
    int maxWeight;
    int round;

    Match(Boxer boxer1, Boxer boxer2, int minWeight, int maxWeight){
        this.boxer1 = boxer1;
        this.boxer2 = boxer2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.round = 1;
    }

    public void fight(){
        if(this.boxer1.weight >= this.minWeight && this.boxer1.weight <= this.maxWeight &&
                this.boxer2.weight >= this.minWeight && this.boxer2.weight <= this.maxWeight){
            while(this.boxer1.health > 0 && this.boxer2.health > 0){
                System.out.println("\n**** " + round + ". ROUND ****");
                round++;
                if(whoFirst()){
                    this.boxer2.health = this.boxer1.hit(this.boxer2);
                    if(isWin())
                        break;
                }

                this.boxer1.health = this.boxer2.hit((this.boxer1));
                if(isWin())
                    break;

                System.out.println(this.boxer1.name + " : Health " + this.boxer1.health);
                System.out.println(this.boxer2.name + " : Health " + this.boxer2.health);
            }
                    }

        else {
            System.out.println("Boxers in different weight. They cannot box!");
        }
    }
    boolean isWin(){
        if(this.boxer1.health == 0){
            System.out.println(this.boxer2.name + " won!");
            return true;
        }
        if(this.boxer2.health == 0) {
            System.out.println(this.boxer1.name + " won!");
            return  true;
        }
        return false;
    }

    boolean whoFirst(){
        Random random = new Random();
        int firstOrSecond = random.nextInt(2);
        if(firstOrSecond == boxer1.start)
            return true;
        else
            return false;

    }
}
