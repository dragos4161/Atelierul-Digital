package Lab2__1.Challenge1;

public class Human {
    private int health;
    private String name;

    public String getName(){
        return name;
    }

    public Human(int health, String humanName){
        this.health = health;
        this.name = humanName;
    }

    public int getHealth(){
        return health;
    }

    public void decreaseHealth(int damage){
        health = health - damage;
    }

}
