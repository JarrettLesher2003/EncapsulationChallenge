package jer.jarrett;

public class Player {
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <=0) {
            System.out.println("You have died..");
            // reduce number of lives remaining?
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
