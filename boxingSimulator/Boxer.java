public class Boxer {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int start;

    Boxer(String name, int damage, int health, int weight, int dodge, int start){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;;
        this.dodge = dodge;
        this.start = start;
    }

    int hit(Boxer foe){
        if(foe.isDodge()){
            System.out.println("Miss");
            return foe.health;
        }
        System.out.println(this.name + " damaged to " + this.damage + " " + foe.name);
        if (foe.health - this.damage < 0)
            return 0;
        return foe.health - this.damage;
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return this.dodge >= randomNumber;
    }

}
