package jer.jarrett;

public class Main {

	public static void main(String[] args) {
//		Player player = new Player();
//		player.fullName = "Tom";
//		player.health = 35;
//		player.weapon = "Pencil Sword";
//
//		int damage = 10;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());
//
//		damage = 16;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());
		EnhancedPlayer player = new EnhancedPlayer("Tom", 200, "Pencil Sword");
		System.out.println("Player enters arena with " + player.getHitPoints() + " initial health.");
	}
}
